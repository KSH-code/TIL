#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2163
 * BOJ 백준온라인져지 2163 초콜릿 자르기 풀이
 */
int cnt = 0;
void slice(int N, int M){
    if(N == 1){
        cnt += M - 1;
    } else if(M == 1){
        cnt += N - 1;
    } else if(N % 2 == 0){
        slice(N / 2, M);
        slice(N / 2, M);
        cnt++;
    } else if(M % 2 == 0){
        slice(N, M / 2);
        slice(N, M / 2);
        cnt++;
    } else if(N % 2 != 0){
        slice(N - 1, M);
        slice(1, M);
        cnt++;
    } else if(M % 2 != 0){
        slice(N, M - 1);
        slice(N, 1);
        cnt++;
    }
}
int main(){
    int N,M;
    scanf("%d%d", &N,&M);
    slice(N, M);
    printf("%d", cnt);
}