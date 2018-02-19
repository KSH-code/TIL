#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/2293
 * BOJ 백준온라인져지 2293 동전 1 풀이
 */
using namespace std;
int main(){
    int n, k, length;
    scanf("%d%d",&n,&k);
    length = n;

    vector<int> coin;
    while(length--){
        int temp;
        scanf("%d", &temp);
        coin.push_back(temp);
    }

    int d[10001] = {1};
    for(int i = 0, size = coin.size(); i<size; i++){
        for(int j = coin[i]; j<=k; j++){
            d[j] += d[j - coin[i]];
        }
    }
    printf("%d", d[k]);
}