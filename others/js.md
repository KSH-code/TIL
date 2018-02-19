## Lexical scoping
Lexical scoping 이란 말 그대로 어휘적 범위다.

어휘적 범위라고 하면 이해가 되지 않는 사람이 많을것이다.

[예제](lexical-scoping.html)로 설명을 해보겠다.

일단 js 의 var variable 은 scope 는 current execution context 라고 MDN 에서 설명하고 있다.

수정시 name 이라는 variable 을 다시 한번 선언했으니 current execution context (함수 context) 에 정의된 것을 변경하므로 출력은 바뀌지 않는다.
## Context
js 가 load 되면, global context 가 생긴다.

Function context 도 존재하는데 그것은 호출이 될 때 마다 생긴다.
### Context data
* arguments
* variable
* scope chain (상위 Context 정보)
* this
* 사용되는 변수들은 scope chain 을 따라 올라가면서 찾는다.
* 함수실행이 종료되면 사라진다.
## Closure
클로저는 외부함수의 변수에 접근할 수 있는 내부함수를 일컫는다.
* scope chain 이라고 불리기도 한다.
* 3 가지의 scope chain 을 가진다.
  * 자신
  * 외부 (상위)
  * global