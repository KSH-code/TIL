#include <cstdio>
/**
 * https://www.acmicpc.net/problem/6378
 * BOJ 백준온라인져지 6378 디지털 루트 풀이
 */

int main(){
    char N;
    int result = 0, temp = 0;
    while(1){
        scanf("%c", &N);
        if(N == '0' && result == 0) break;
        if(N <= '9' && N >= '0'){
            result += N - 48;
        }else{
            while(result >= 10){
                if(result >= 1000) temp += result / 1000, result -= result / 1000 * 1000;
                if(result >= 100) temp += result / 100, result -= result / 100 * 100;
                if(result >= 10) temp += result / 10, result -= result / 10 * 10;
                result %= 10;
                result += temp;
                temp = 0;
            }
            printf("%d\n", result);
            temp = result = 0;
        }
    }
}