#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2525
 * BOJ 백준온라인져지 2525 오븐 시계 풀이
 */
int main(){
    int hour, minute;
    scanf("%d%d", &hour, &minute);

    int time;
    scanf("%d", &time);

    while(time--){
        minute++;
        if(minute == 60){
            hour++;
            if(hour == 24){
                hour = 0;
            }
            minute = 0;
        }
    }
    printf("%d %d", hour, minute);
}