#include <cstdio>
/**
 * https://www.acmicpc.net/problem/10872
 * BOJ 백준온라인져지 10872 팩토리얼 풀이
 */
int main(){
    unsigned long long result = 1;
    int N;
    scanf("%d", &N);
    while(N--) result *= N+1;
    printf("%lld", result);
}