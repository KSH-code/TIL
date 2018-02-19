#include <cstdio>
#include <math.h>
/**
 * https://www.acmicpc.net/problem/1004
 * BOJ 백준온라인져지 1004 어린 왕자 풀이
 */
int main(){
    
    int T;
    scanf("%d",&T);

    while(T--){
        int x1,x2,y1,y2,result=0;
        scanf("%d%d%d%d",&x1,&y1,&x2,&y2);

        int N;
        scanf("%d",&N);

        while(N--){
            int cx,cy,r;
            scanf("%d%d%d",&cx,&cy,&r);

            double d1 = sqrt(pow(x1-cx,2)+pow(y1-cy,2));
            double d2 = sqrt(pow(x2-cx,2)+pow(y2-cy,2));
            if(d1 <= r && d2 <= r) continue;
            else if(d1 <= r) result++;
            else if(d2 <= r) result++;
        }

        printf("%d\n",result);
    }

    return 0;
}