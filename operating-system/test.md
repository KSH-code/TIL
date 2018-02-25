# 6.4
* Monitor 는 semaphore 의 P, V 의 역할을 하는 변수는는 무엇이 있을까요?
* Monitor 와 semaphore 의 검사하는 차이는 무엇일까요? (상태로 검사, 값으로 검사)
* Monitor 와 semaphore 의 차이점은 무엇일까요? (세마포어는 critcal section 에 접근할 때, 직접 lock 을 건다.)
* 
# 8.3
* page table 의 각 entry 에는 구분을 위한 bit 가 2 개 있습니다. 무엇이 있을까요?
  * invalid, valid 구분을 위한 bit 는 왜 필요 할까요?
* 페이지 테이블은 모든 페이지에대해 항목을 구성해야 되기 때문에 공간의 낭비가 심하다. 이 것을 해결하기 위한 대안은 어떤 걸까요?
  * 시스템에 테이블 1개
  * Inverted page table 의 구성 요소는? (pid, page-number, offset) (logical address 에 있다)
    * 단점 ? (테이블 모두 탐색)
      * 해결 방법 (연관 레지스터 (associative register), 병렬 탐색)
* Segment 기법이 Paging 보다 공유와 보안에 있어서 효율적인 이유는 무엇일까요?