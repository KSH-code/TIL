#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1016
 * BOJ 백준온라인져지 1016 제곱 ㄴㄴ 수 풀이
 */
#define MAX 1000005
using namespace std;
int main(){
    long long min, max;
    scanf("%lld%lld", &min, &max);
    
    int count = -1;


    int *duplicatedValue = new int[MAX];
    for(long long i = 2; i * i <= max; i++){
        
        if(duplicatedValue[i] == 1) continue;

        for(long long j = i * 2; j * j <= max; j += i){
            if(duplicatedValue[i] == 0) duplicatedValue[j]++;
            else if(duplicatedValue[i] > 1) duplicatedValue[j]--; 
        }

        count -= (max / (i * i) - (min - 1) / (i * i)) * (duplicatedValue[i] - 1);
        
    }

    printf("%lld", max - min - count);
}