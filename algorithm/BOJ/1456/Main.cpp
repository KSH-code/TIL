#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1456
 * BOJ 백준온라인져지 1456 거의 소수 풀이
 */
int main(){
    long long min, max;
    int count = 0;
    scanf("%lld%lld", &min, &max);
    bool *isPrimeNumber = new bool[(int)1e+7 + 1];
    int *primeNumber = new int[(int)1e+7 + 1];
    int cnt = 0;
    for(long long i = 2; i * i <= max ; i++){
        if(!isPrimeNumber[i]){
            for(long long j = i * 2; j * j <= max; j += i) isPrimeNumber[j] = true;
            primeNumber[cnt++] = i;
        }
    }
    
    for(int i = 0; i < cnt; i++){
        long long n = primeNumber[i];
        while(primeNumber[i] <= max / n){
            if(primeNumber[i] * n >= min) count++;
            n *= primeNumber[i];
        } 
    }

    printf("%d", count);
}