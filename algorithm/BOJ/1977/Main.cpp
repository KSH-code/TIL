#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1977
 * BOJ 백준온라인져지 1977 완전제곱수 풀이
 */
int main(){
    int minimum, maximum, sum = 0, resultMin = 0;
    scanf("%d%d", &minimum, &maximum);
    int i = 0;
    while(++i){
        if(i * i >= minimum && i * i <= maximum){
            if(!resultMin) resultMin = i * i;
            sum += i * i;
        }else if(i * i > maximum) break;
    }
    if(sum) printf("%d\n%d", sum, resultMin);
    else printf("-1");
}