#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/1865
 * BOJ 백준온라인져지 1865 웜홀 풀이
 */
using namespace std;
int N, M;
int main () {
  int T;
  scanf("%d", &T);
  while(T--) {
    int N, M, W;
    scanf("%d%d%d", &N, &M, &W);
    int *d = new int[501];
    vector<vector<pair<int, int> > > edges(N + 1);
    for (int i = 0; i < 501; i++) {
      d[i] = 987654321;
    }
    d[1] = 0;
    for (int i = 0; i < M; i++) {
      int S, E, T;
      scanf("%d%d%d", &S, &E, &T);
      edges[S].push_back(make_pair(E, T));
      edges[E].push_back(make_pair(S, T));
    }
    for (int i = 0; i < W; i++) {
      int S, E, T;
      scanf("%d%d%d", &S, &E, &T);
      edges[S].push_back(make_pair(E, -T));
    }
    bool update = true;
    int cnt = 0;
    while (update && cnt != N) {
      cnt++;
      update = false;
      for (int i = 1; i <= N; i++) {
        for (int j = 0; j < edges[i].size(); j++) {
          if (d[edges[i][j].first] > d[i] + edges[i][j].second) {
            d[edges[i][j].first] = d[i] + edges[i][j].second;
            update = true;
          }
        }
      }
    }
    printf("%s\n", cnt == N ? "YES" : "NO");
  }
}