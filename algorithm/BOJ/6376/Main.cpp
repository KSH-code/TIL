#include <cstdio>
/**
 * https://www.acmicpc.net/problem/6376
 * BOJ 백준온라인져지 6376 e 계산 풀이
 */

int main(){
    printf("n e\n");
    printf("- -----------\n");
    printf("0 1\n");
    printf("1 2\n");
    printf("2 2.5\n");
    double factorial = 2;
    double i = 2;
    double result = 2.5;
    while(factorial < 9){
        factorial++;
        i *= factorial;
        result += 1 / i;
        printf("%.0f %.9f\n", factorial, result);
    }
}