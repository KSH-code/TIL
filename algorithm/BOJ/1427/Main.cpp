#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1427
 * BOJ 백준온라인져지 1427 소트인사이드 풀이
 */
int main(){
    char N = '0';
    int number[10] = {0}; // 0 ~ 9
    while(scanf("%c", &N) != EOF) number[N-48]++;
    for(int i = 9; i >= 0; i--) while(number[i]--) printf("%d",i);
    return 0;
}