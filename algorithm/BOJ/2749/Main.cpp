#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2749
 * BOJ 백준온라인져지 2749 피보나치 수 3 풀이
 */
int main(){
    unsigned long long N;
    scanf("%lld", &N);
    
    int *fibonacci = new int[1500001];
    fibonacci[1] = 1;
    for(int i = 2; i <= 1500000; i++){
        fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % 1000000;
    }
    
    printf("%d", fibonacci[N % 1500000]);
}