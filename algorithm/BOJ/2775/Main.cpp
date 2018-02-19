#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2775
 * BOJ 백준온라인져지 2775 부녀회장이 될테야 풀이
 */
#define MAX 15
int main(){
    int T,k,n;
    scanf("%d", &T);
    int d[MAX][MAX] = {};
    for(int i = 1; i<MAX; i++){
        d[0][i] = i;
        d[i][1] = 1;
    }
    for(int i = 1; i<MAX; i++){
        for(int j = 2; j<MAX; j++){
            d[i][j] = d[i][j-1] + d[i-1][j];
        }
    }
    while(T--){
        scanf("%d%d",&k,&n);
        printf("%d\n",d[k][n]);
    }
    return 0;
}