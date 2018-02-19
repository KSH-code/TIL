#include <cstdio>
/**
 * https://www.acmicpc.net/problem/10159
 * BOJ 백준온라인져지 10159 저울 풀이
 */
using namespace std;
int N, M;
void floyd (int edges[][101]) {
  for (int k = 1; k <= N; k++) {
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        if (edges[i][k] && edges[k][j]) edges[i][j] = 1;
      }
    }
  }
}
int main () {
  scanf("%d%d", &N, &M);
  int (*edges)[101] = new int[101][101];
  for (int i = 0; i < M; i++) {
    int x, y;
    scanf("%d%d", &x, &y);
    edges[x][y] = 1;
  }
  
  floyd(edges);
  
  for (int i = 1; i <= N; i++) {
    int result = 0;
    for (int j = 1; j <= N; j++) {
      if (edges[i][j] == 0 && edges[j][i] == 0) result++;
    }
    printf("%d\n", result - 1);
  }
}