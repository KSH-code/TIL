#include <cstdio>
#include <math.h>
/**
 * https://www.acmicpc.net/problem/6588
 * BOJ 백준온라인져지 6588 골드바흐의 추측 풀이
 */
#define MAX 1000001
int main(){
    int *isPrimeNumber = new int[MAX];
    for(int i = 2; i < MAX ; i++) isPrimeNumber[i] = true;
    for(int i = 2, squareRoot = sqrt(MAX); i <= squareRoot; i++){
        if(isPrimeNumber[i])
            for(int j = i * i; j < MAX ; j += i)
                isPrimeNumber[j] = false;
    }
    while(1){
        int N;
        scanf("%d", &N);
        if(N){
            int loopStartNumber = N - 1;
            bool isPrint = false;
            for(int i = loopStartNumber, NDivided = N / 2; i >= NDivided && !isPrint; i -= 2){
                if(isPrimeNumber[i] && isPrimeNumber[N - i]){
                    printf("%d = %d + %d", N, N - i, i);
                    isPrint = true;
                }
            }
            if(!isPrint) printf("Goldbach's conjecture is wrong.");
            printf("\n");
        }else break;
    }
}