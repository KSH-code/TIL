#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2960
 * BOJ 백준온라인져지 2960 에라토스테네스의 체 풀이
 */
int main(){
    int N,K;
    scanf("%d%d",&N,&K);
    bool *isPrimeNumber = new bool[N+1];

    int count = 0, result = 0;
    for(int i = 2; i <= N; i++){
        if(!isPrimeNumber[i]){
            for(int j = i; j <= N; j += i){
                if(!isPrimeNumber[j]){
                    isPrimeNumber[j] = true, count++;
                    if(count == K) result = j;
                }
            }
        }
    }
    printf("%d", result);
}