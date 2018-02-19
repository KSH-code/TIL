#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/11403
 * BOJ 백준온라인져지 11403 경로 찾기 풀이
 */
using namespace std;
vector<bool> visited;
int **edges;
int N;
void dfs(int cur, int fix);
int main(){
    scanf("%d",&N);
    edges = new int*[N+1];


    for(int i = 1; i<=N; i++){
        edges[i] = new int[N+1];
        for(int j = 1; j<=N; j++){
            scanf("%d",&edges[i][j]);
        }
    }
        
    visited.resize(N+1);
    for(int i = 1; i<=N; i++){ 
        for(int j = 1; j<=N; j++) visited[j] = false;
        dfs(i, i);
    }
    
    for(int i = 1; i<=N; i++){
        for(int j = 1; j<=N; j++){
            printf("%d ",edges[i][j]);
        }
        printf("\n");
    }
}
void dfs(int cur, int fix){
    for(int i = 1; i<=N; i++){
        if(cur == i) continue;
        if(edges[cur][i] && !visited[i]){
            visited[i] = true;
            edges[fix][i] = true;
            dfs(i, fix);
        }
    }
}