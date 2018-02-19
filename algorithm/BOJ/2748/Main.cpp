#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2748
 * BOJ 백준온라인져지 2748 피보나치 수 2 풀이
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