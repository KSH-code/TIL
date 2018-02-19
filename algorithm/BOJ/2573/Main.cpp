#include <cstdio>
#include <queue>
/**
 * https://www.acmicpc.net/problem/2573
 * BOJ 백준온라인져지 2573 빙산 풀이
 */
using namespace std;
int leftRightCheck[4] = {-1, 0, 0, 1};
int topDownCheck[4] = {0, -1, 1, 0};
int max(int a, int b){
    return a>b?a:b;
}
int main(){
    int N,M;
    scanf("%d%d",&N,&M);

    int **vertex = new int*[N+1];
    bool **visited = new bool*[N+1];
    for(int i = 1; i<=N; i++){
        vertex[i] = new int[M+1];
        visited[i] = new bool[M+1];
        for(int j = 1; j<=M; j++){
            scanf("%d", &vertex[i][j]);
        }
    }

    queue<pair<int, int> > queue;
    bool escapeLoop = false;

    int result = 0;
    while(!escapeLoop){
        bool isAllZero = true;
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=M; j++){
                if(!visited[i][j] && vertex[i][j] && result > 0) escapeLoop = true; 
                visited[i][j] = false;
                if(vertex[i][j] && queue.empty()) queue.push(make_pair(i, j)), visited[i][j] = true;
                if(vertex[i][j]) isAllZero = false;
            }
        }
        if(isAllZero) result = 0;
        if(escapeLoop || isAllZero) break;
        result++;
        while(queue.size()){
            pair<int, int> element = queue.front();
            queue.pop();
            int row = element.first;
            int column = element.second;
            for(int i = 0; i<4; i++){
                int tempRow = row + topDownCheck[i];
                int tempColumn = column + leftRightCheck[i];
                if(tempRow <= 0 || tempColumn <= 0 || tempRow > N || tempColumn > M || visited[tempRow][tempColumn]) continue;
                if(vertex[tempRow][tempColumn])
                    queue.push(make_pair(tempRow, tempColumn)), visited[tempRow][tempColumn] = true;
                else 
                    if(!visited[tempRow][tempColumn]) vertex[row][column]--;
            }
            vertex[row][column] = max(vertex[row][column], 0);
        }

    }

    printf("%d", max(0, result-1));
}