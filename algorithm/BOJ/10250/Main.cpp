#include <cstdio>
/**
 * https://www.acmicpc.net/problem/10250
 * BOJ 백준온라인져지 10250 ACM 호텔 풀이
 */
int main(){
    int T,H,W,N,result;
    scanf("%d", &T);
    while(T--){
        scanf("%d%d%d",&H,&W,&N);
        W = 1;
        while(N>H) W++, N-=H;
        printf("%d%02d\n", N, W);
    }
    return 0;
}