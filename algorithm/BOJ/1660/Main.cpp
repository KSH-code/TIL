#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/1660
 * BOJ 백준온라인져지 1660 캡틴 이다솜 풀이
 */
#define MAX 300001
using namespace std;
int main(){

    int temp = 1, bomb = temp;

    vector<int> tetrahedron;
    tetrahedron.push_back(temp);
    while(temp++){
        bomb += temp * (temp + 1) / 2;
        if(bomb > 300000) break;
        tetrahedron.push_back(bomb);
    }

    int N;
    scanf("%d", &N);
    
    vector<int> minimumQuantity;
    minimumQuantity.resize(MAX);
    for(int i = 1; i < MAX; i++) minimumQuantity[i] = MAX;
    int size = tetrahedron.size();
    for(int i = 0; i < size; i++) minimumQuantity[tetrahedron[i]] = 1;

    for(int i = 0; i < size; i++){
        for(int j = tetrahedron[i]; j <= N; j++){
            minimumQuantity[j] = min(minimumQuantity[j], minimumQuantity[j - tetrahedron[i]] + 1);
        }
    }

    printf("%d", minimumQuantity[N]);
}