#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/4963
 * BOJ 백준온라인져지 4963 섬의 개수 풀이
 */
using namespace std;
int xxxx[] = {-1, -1, -1, 0, 1, 1, 1, 0};
int yyyy[] = {-1, 0, 1, 1, 1, 0, -1, -1};
int N, M;
vector<vector<bool> > visited;
vector<vector<int> > map;
void dfs (int x, int y) {
  if (visited[x][y]) return;
  visited[x][y] = true;
  for (int i = 0; i < 8; i++) {
    int cx = x + xxxx[i]; int cy = y + yyyy[i];
    if (cx < 0 || cy < 0 || cx >= N || cy >= M || map[cx][cy] == 0) continue;
    dfs(cx, cy);
  }
}
int main () {
  while (1) {
    scanf("%d%d", &M, &N);
    if ((N | M) == 0) break;
    map = vector<vector<int> >(N, vector<int>(M, 0));
    visited = vector<vector<bool> >(N, vector<bool>(M, false));
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        scanf("%d", &map[i][j]);
      }
    }
    int result = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (map[i][j] && !visited[i][j]) {
          result++;
          dfs(i, j);
        }
      }
    }
    printf("%d\n", result);
  }
}