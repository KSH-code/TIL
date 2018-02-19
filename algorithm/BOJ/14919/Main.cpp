#include <cstdio>
#include <vector>
#include <math.h>
/**
 * https://www.acmicpc.net/problem/14919
 * BOJ 백준온라인져지 14919 분포표 만들기 풀이
 */
#define MUL 1e+6
using namespace std;
int main(){
    int m;
    scanf("%d", &m);
    double temp;
    vector<int> a;
    int bMin = 0;
    int b = MUL / m, bMax;
    while(scanf("%lf", &temp) != EOF){
        a.push_back(ceil((double)temp * MUL));
    }
    for(int j = 0, count = 0, size = a.size(); j < m; j++, count = 0){
        bMax = (j + 1) * b;
        for(int i = 0; i < size; i++)
            if(bMin <= a[i] && a[i] < bMax) count++;
        printf("%d ", count);

        bMin = bMax;
    }
}