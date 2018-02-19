#include <cstdio>
#include <math.h>
/**
 * https://www.acmicpc.net/problem/1002
 * BOJ 백준온라인져지 1002 터렛 풀이
 */
int max(float a, float b){
    return a>b?a:b;
}
int min(float a, float b){
    return a>b?b:a;
}
int main(){
    
    int N;
    scanf("%d",&N);

    while(N--){
        int x1, y1, r1, x2, y2, r2;
        scanf("%d%d%d%d%d%d",&x1,&y1,&r1,&x2,&y2,&r2);

        double d = sqrt(pow((x1-x2), 2) + pow(y1-y2, 2)); // distance = (x1 - x2)^2 + (y1 - y2)^2
        int result = 0;
        if(d == 0){
            if(r1 == r2)
                result = -1; // 겹치는 경우
        }else if(r1 + r2 == d){
            result = 1; // 한 점에서 만나는 경우(외접)
        }else if(r1 + r2 > d){ // 원 안의 원
            if(d + min(r1, r2) == max(r1, r2))
                result = 1; // 내접
            else if(d > max(r1, r2) - min(r1, r2))
                result = 2;
        }

        printf("%d\n",result);
    }

    return 0;
}