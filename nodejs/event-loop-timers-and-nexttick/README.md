# [원문](https://nodejs.org/en/docs/guides/event-loop-timers-and-nexttick/)
# [번역본](https://nodejs.org/ko/docs/guides/event-loop-timers-and-nexttick/)
# 이벤트 루프란 무엇인가요?
이벤트 루프는 Node.js 가 non-blocking I/O 연산을 사용할 수 있게 합니다.

자바 스크립트가 단일 쓰레드임에도 불구하고 가능할때마다 시스템 커널에 작업을 오프로드합니다.

---
## 오프로드는 무엇인가요?
오프로드는 다른 계층으로 옮겨서 처리하는것 입니다.

---
대부분의 최근의 커널들은 멀티 쓰레드이기 때문에 여러 가지 처리가 백그라운드에서 가능합니다.

작업중 하나가 완료되면, 커널은 Node.js 를 호출하여 poll queue 에 적절한 callback 을 추가해 실행합니다.
# 이벤트 루프 설명
Node.js 가 실행될 때, 이벤트 루프가 초기화하고, 비동기 API 호출, 스케줄 타이머 또는 `process.nextTick()` 을 호출할 수 있는 제공된 입력 스크립트를 처리합니다.

그런 다음 이벤트 루프를 처리합니다.

밑의 다이어그램은 간단한 이벤트 루프 처리입니다.
```
   ┌───────────────────────┐
┌─>│        timers         │
│  └──────────┬────────────┘
│  ┌──────────┴────────────┐
│  │     I/O callbacks     │
│  └──────────┬────────────┘
│  ┌──────────┴────────────┐
│  │     idle, prepare     │
│  └──────────┬────────────┘      ┌───────────────┐
│  ┌──────────┴────────────┐      │   incoming:   │
│  │         poll          │<─────┤  connections, │
│  └──────────┬────────────┘      │   data, etc.  │
│  ┌──────────┴────────────┐      └───────────────┘
│  │        check          │
│  └──────────┬────────────┘
│  ┌──────────┴────────────┐
└──┤    close callbacks    │
   └───────────────────────┘
```
각 단계는 실행할 콜백의 FIFO queue 대기열이 있습니다.

각 단계는 각자의 방식으로 특별하지만, 일반적으로 이벤트 루프에 단계에 들어가면 해당 단계와 관련된 모든 작업이 수행됩니다.

그런 다음 queue 가 모두 사라지거나 최대 콜백수가 실행될 떄 까지 큐의 단계들은 실행됩니다.

큐가 모두 사용되거나 콜백의 한계에 다다르면 이벤트 루프는 다음 단계로 이동합니다.

이러한 작업이 또 다른작업을 schedule(관리) 하거나 poll 단계에서 처리된 새로운 이벤트가 커널에 의해 큐에 추가될 수 있으므로 poll 이벤트를 처리하면서 poll 이벤트를 큐에 추가할 수 있습니다.

따라서 킨 콜백을 사용하면 타이머 임계값보다 훨씬 더 긴 poll 단계를 실행할 수 있습니다.
## 단계 설명
* timers: 타이머는 콜백을 관리하는 단계입니다. by `setTimeout` and `setInterval`
* I/O callbacks: 타이머에 의해 관리된 것, `setImmediate`, close callbacks 을 제외하고 거의 모든 콜백은 실행됩니다.
* idle, prepare: 내부적으로 실행됩니다.
* poll: 새로운 I/O 이벤트들을 찾아옵니다. 적절한 시기에 노드가 여기서 차단됩니다.
* check: `setImmediate` callbacks 는 여기서 실행됩니다.
* close callbacks: e.g `socket.on('close')`

각 이벤트 루프 실행 사이에 Node.js 는 비동기식 I/O 와 timers를 기다리고 있는지 기다리고 있으며, 없으면 완전히 종료합니다.
## 자세히 설명 (단계)
### timers
timer 는 사람이 원하는 정확한 시간이아니라 제공된 콜백이 일정 시간 후에 실행되어야 하는 기준시간을 지정한다.

타이머 콜백은 지정한 시간이 지난 후에 스케쥴링 될 수 있는 가장 이른 시간에 실행된다.

운영체제 스케쥴링이나 다른 콜백 실행 때문에 지연될 수 있다.

기술적으로는 poll 단계에서 타이머를 언제 실행할지 제어한다.

예를 들어, 100ms 임계 값 이후 실행되도록 한다고 하자. [예제](timer.js)

이벤트 루프가 poll 단계에 진입했을 때 빈 큐를 가지고 있으므로 (`fs.readdir` 이 아직 완료되지 않음) 가장 빠른 타이머의 임계 값에 도달할 때까지 수밀리 초 기다린다.

0 ~ 2ms 가 걸리는 동안 1000ms 를 기다리는 콜백이 poll 큐에 추가되어 실행된다.

그 다음 timers 단계에 되돌아간다.

그리고 실행된다. (timer 는 1000ms 가 지나고 실행됨)

이해를 하기위해 [예제](timer2.js) 를 또 만들었다.

`setTimeout` 은 0ms 로 설정해놓고 `readdir` 을 했다.

결과는 여러 가지였다.
* 1ms have passed since I was scheduled
* 2ms have passed since I was scheduled
* 1001ms have passed since I was scheduled
* 1002ms have passed since I was scheduled
* 1003ms have passed since I was scheduled

지금 timer 만 이해된 상태에서 적어보자면

* timer -> 실행될 기준시간 정함 -> poll -> 임계 값 확인
    * 성공
    * 실패 -> `readdir` -> 1000ms -> 다시 돌아감
