#include <cstdio>
#include <cstring>
/**
 * https://www.acmicpc.net/problem/1475
 * BOJ 백준온라인져지 1475 방 번호 풀이
 */
#define MAX 1111111
#define LENGTH 10
int main(){
    char str1[MAX];
    int d[LENGTH] = {0}; // 0 ~ 9 {}를 안하면 쓰레기값이 들어가서 안됨
    scanf("%s", str1);
    for(int i = 0, length = strlen(str1); i<length; i++)
        str1[i]=='9'?d[6]++:d[str1[i]-48]++;
    int cnt = 0, loop = 1;
    while(loop){
        loop = 0, cnt++, d[6]--;
        for(int i = 0; i<LENGTH-1; i++){
            d[i]--;
            if(d[i] > 0) loop = 1;
        }
    }
    printf("%d", cnt);
    return 0;
}