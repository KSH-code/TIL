#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/2294
 * BOJ 백준온라인져지 2294 동전 2 풀이
 */
#define MAX 10002
using namespace std;

int min(int a, int b){
    return a<b?a:b;
}

int main(){
    int n,k;
    scanf("%d%d", &n, &k);

    vector<int> coinList;
    coinList.resize(MAX);
    for(int i = 1; i < MAX; i++) coinList[i] = MAX;

    while(n--){
        int temp;
        scanf("%d",&temp);
        if(temp < MAX)
            coinList[temp] = 1;
    }


    for(int i = 1; i < MAX; i++){
        for(int j = i; j < MAX; j++){
            coinList[j] = min(coinList[j], coinList[j % i] + coinList[i] * (int) (j / i));
        }
    }

    printf("%d", coinList[k] == MAX ? -1 : coinList[k]);
}