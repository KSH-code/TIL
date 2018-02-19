#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2530
 * BOJ 백준온라인져지 2530 인공지능 시계 풀이
 */
int main(){
    int hour, minute, second;
    scanf("%d%d%d", &hour, &minute, &second);

    int time;
    scanf("%d", &time);

    while(time--){
        second++;
        if(second == 60){
            minute++;
            if(minute == 60){
                hour++;
                if(hour == 24){
                    hour = 0;
                }
                minute = 0;
            }
            second = 0;
        }
    }
    printf("%d %d %d", hour, minute, second);
}