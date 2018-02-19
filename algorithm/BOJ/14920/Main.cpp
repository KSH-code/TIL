#include <cstdio>
/**
 * https://www.acmicpc.net/problem/14920
 * BOJ 백준온라인져지 14920 3n+1 수열 풀이
 */
int main(){
    int N, count = 1;
    scanf("%d", &N);
    while(N != 1){
        if(N % 2) N = 3 * N + 1;
        else N /= 2;
        count++;
    }
    printf("%d", count);
}