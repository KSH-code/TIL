#include <cstdio>
/**
 * https://www.acmicpc.net/problem/10757
 * BOJ 백준온라인져지 10757 큰 수 A+B 풀이
 */
#define MAX 10002
int main(){
    int AB[3][MAX];
    for(int i = 0; i < MAX; i++){
        AB[2][i] = AB[1][i] = AB[0][i] = -1;
    }
    for(int i = 0; i < 2; i++){
        int idx = MAX - 1;
        char temp;
        while(scanf("%c", &temp) != EOF){
            if(temp >= '0' && temp <= '9') AB[i][idx--] = temp - 48;
            else break;
        }
    }
    int big = 0;
    // for(int i = 0; i < MAX; i++){
    //     if(AB[0][1] || AB)
    // }
    int rounding = 0;
    for(int i = MAX - 1; i >= 0; i--){
        if(rounding){
            AB[2][i] = 1;
            rounding = 0;
        }
        if(AB[0][i] > -1){
            if(AB[2][i] > -1) AB[2][i] += AB[0][i];
            else AB[2][i] = AB[0][i];
        }
        if(AB[1][i] > -1){
            if(AB[2][i] > -1) AB[2][i] += AB[1][i];
            else AB[2][i] = AB[1][i];
        }
        if(AB[2][i] > 9){
            AB[2][i] -= 10;
            rounding++;
        }
    }
    for(int i = 0; i < MAX; i++){
        if(AB[2][i] > -1) printf("%d", AB[2][i]);
    }
}