#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/1037
 * BOJ 백준온라인져지 1037 약수 풀이
 */
using namespace std;
vector<int> divisor;
void quickSort(int l, int r){
    int i = 0, j = r;
    int pivot = divisor[(l + r) / 2];
    do{
        while(divisor[i] < pivot) i++;
        while(divisor[j] > pivot) j--;
        if(i <= j){
            int temp = divisor[i];
            divisor[i] = divisor[j];
            divisor[j] = temp;
            i++, j--;
        }
    }while(i <= j);
    if(l < j) quickSort(l, j);
    if(r > i) quickSort(i, r);
}
int main(){
    int N;
    scanf("%d", &N);
    while(N--){
        int temp;
        scanf("%d", &temp);
        divisor.push_back(temp);
    }
    quickSort(0, divisor.size()-1);
    printf("%ld", (long) divisor[0] * (long) divisor[divisor.size()-1]);
}