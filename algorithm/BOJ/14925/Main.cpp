#include <cstdio>
/**
 * https://www.acmicpc.net/problem/14925
 * BOJ 백준온라인져지 14925 목장 건설하기 풀이
 */
int min(int a, int b){
    return a < b ? a : b;
}
int max(int a, int b){
    return a > b ? a : b;
}
int main(){
    int rowSize, columnSize, result = 0;
    scanf("%d%d", &rowSize, &columnSize);
    rowSize++, columnSize++;
    bool **map = new bool*[rowSize];
    int **dp = new int*[rowSize];
    for(int i = 0; i < rowSize; i++){
        map[i] = new bool[columnSize];
        map[i][0] = true;
        dp[i] = new int[columnSize];
    }
    for(int i = 0; i < columnSize; i++){
        map[0][i] = true;
    }
    for(int i = 1; i < rowSize; i++){
        for(int j = 1; j < columnSize; j++){
            dp[i][j] = 0;
            int temp;
            scanf("%d", &temp);
            map[i][j] = temp == 0;
            if(map[i][j]){
				dp[i][j] = 1;
				int t = min(dp[i - 1][j - 1], min(dp[i - 1][j], dp[i][j - 1]));
                dp[i][j] = t + 1;
                result = max(dp[i][j], result);
            }
        }
    }

    printf("%d", result);
}