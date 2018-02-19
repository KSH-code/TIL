#include <cstdio>
/**
 * https://www.acmicpc.net/problem/10826
 * BOJ 백준온라인져지 10826 피보나치 수 4 풀이
 */
int main(){
    int N;
    scanf("%d", &N);
    
    long long *fibonacci = new long long[N+2];
    fibonacci[1] = 1;
    for(int i = 2; i <= N; i++){
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }
    printf("%lld", fibonacci[N]);
}