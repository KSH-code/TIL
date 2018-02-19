#include <cstdio>
#include <math.h>
/**
 * https://www.acmicpc.net/problem/2108
 * BOJ 백준온라인져지 2108 통계학 풀이
 */
#define MAX_LENGTH 8001
#define RoundOff(x, dig) (floor((x) * pow(10,dig) + 0.5) / pow(10,dig))
int main(){
    int N,cnt,list[MAX_LENGTH] = {},idx,many[2]={},max=0,min=8000;
    long long sum = 0;
    scanf("%d", &N);
    cnt = N;
    while(cnt--){
        scanf("%d",&idx);
        sum+=idx, list[idx+=4000]++;
    }
    idx = 0;
    for(int i = 0; i<MAX_LENGTH; i++){
        if(many[0] < list[i]) many[0] = list[i], many[1] = i - 4000;
        if(list[i]){
            max = (max < i) ? i : max;
            min = (min > i) ? i : min;
        }
    }
    cnt = 0;
    for(int i = 0; i<MAX_LENGTH; i++){
        if(many[0] == list[i]){
            if(cnt){
                many[1] = i - 4000;
                break;
            }
            cnt++;
        }
    }
    for(int i = 0, length = N/2; i<=length; i++){
        while(list[idx]==0) idx++;
        list[idx]--;
    }
    printf("%.lf\n",roundf(sum/(double)N));
    printf("%d\n",idx-4000);
    printf("%d\n",many[1]);
    printf("%d",max-min);
    return 0;
}