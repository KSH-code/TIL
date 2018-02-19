#include <cstdio>
/**
 * https://www.acmicpc.net/problem/14921
 * BOJ 백준온라인져지 14921 용액 합성하기 풀이
 */
using namespace std;
int abs(int a){
    return a > 0 ? a : -a;
}
int min(int a, int b){
    int aa = abs(a);
    int bb = abs(b);
    return aa < bb ? a : b;
}
int main(){
    int N;
    scanf("%d", &N);
    int *list = new int[N];
    for(int i = 0; i < N; i++){
        scanf("%d", &list[i]);
    }
    int maximum = 1000000000, l = 0, r = N - 1;
    do{
        if(abs(maximum) > abs(list[l] + list[r])){
            maximum = list[l] + list[r];
        }
        if(abs(list[l] + list[r]) >= abs(list[l] + list[r - 1])){
            r--;
        }else if(r + 1 < N && abs(list[l] + list[r]) > abs(list[l] + list[r + 1])){
            r++;
        }else{
            l++;
        }
    }while(l < r);
    printf("%d", maximum);
}