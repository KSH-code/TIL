#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1932
 * BOJ 백준온라인져지 1932 숫자삼각형 풀이
 */
int max(int a, int b){
    return a>b?a:b;
}
int main(){
    int T;
    scanf("%d",&T);
    int **arr = new int*[T];
    for(int i = 0; i<T; i++) arr[i] = new int[T];
    for(int i = 0; i<T; i++){
        for(int j = 0; j<=i; j++){
            scanf("%d",&arr[i][j]);
        }
    }
    for(int i = T-2; i>=0; i--){
        for(int j = 0; j<=i; j++){
            arr[i][j] += max(arr[i+1][j], arr[i+1][j+1]);
        }
    }
    printf("%d", arr[0][0]);
}