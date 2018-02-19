#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1613
 * BOJ 백준온라인져지 1613 역사 풀이
 */
using namespace std;
int N, M;
void floyd (int edges[][401]) {
  for (int k = 1; k <= N; k++) {
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        if (edges[i][k] == 1 && edges[k][j] == 1) edges[i][j] = 1, edges[j][i] = -1;
      }
    }
  }
}
int main () {
  scanf("%d%d", &N, &M);
  int (*edges)[401] = new int[401][401];
  for (int i = 0; i < M; i++) {
    int x, y;
    scanf("%d%d", &x, &y);
    edges[x][y] = -1;
    edges[y][x] = 1;
  }
  
  floyd(edges);
  scanf("%d", &M);
  for (int i = 0; i < M; i++) {
    int x, y;
    scanf("%d%d", &x, &y);
    printf("%d\n", edges[x][y]);
  }
}