# 2018-08-13
## 참고한 reference
1. https://stackoverflow.com/questions/16264647/what-does-a-dollar-sign-mean-in-mongodb-in-terms-of-groups
2. https://docs.mongodb.com/manual/reference/aggregation-variables/#system-variables
## 결과
$$ROOT 와 $$CURRENT 가 있다.

$$ROOT 는 aggregation pipeline stage 에서의 최상위 document 를 선택하는 variable 이다.

$$CURRENT 는 따로 설정해주지 않는이상 $$ROOT 와 동일한 기능을 하며, $[field name] 으로도 줄여서 사용이 가능하다. $$CURRENT.[field name]