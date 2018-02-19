#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2953
 * BOJ 백준온라인져지 2953 나는 요리사다 풀이
 */
int max(int a, int b){
    return a > b ? a : b;
}
int main(){
    int rows = 5, columns = 4;
    int **grades = new int*[rows + 1];

    int max = 0, idx = 0;
    for(int i = 1, sum = 0; i <= rows; i++, sum = 0){
        grades[i] = new int[columns + 1];
        for(int j = 1; j <= columns; j++){
            scanf("%d", &grades[i][j]);
            sum += grades[i][j];
        }
        if(max <= sum) idx = i, max = sum;
    }

    printf("%d %d", idx, max);
}