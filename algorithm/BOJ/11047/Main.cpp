#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/11047
 * BOJ 백준온라인져지 11047 동전 0 풀이
 */
using namespace std;
int main(){
    int N, K;
    scanf("%d%d", &N, &K);
    int loopCount = N;

    vector<int> value;
    while(loopCount--){
        int tempValue;
        scanf("%d", &tempValue);
        value.push_back(tempValue);
    }

    int result = 0, idx = value.size() - 1;
    while(K){
        
        while(K < value[idx]){
            idx--;
        }

        result += K / value[idx];
        K -= value[idx] * (K / value[idx]);
    }

    printf("%d", result);
}