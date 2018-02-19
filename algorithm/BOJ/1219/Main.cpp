#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/1219
 * BOJ 백준온라인져지 1219 오민식의 고민 풀이
 */
struct Edge {
  int s, e, pr;
};
using namespace std;
long long INF = 2147483647L * 214214214;
int main () {
  int N, startCity, endCity, M;
  scanf("%d%d%d%d", &N, &startCity, &endCity, &M);
  long long *d = new long long[N];
  long long *p = new long long[N];
  for (int i = 0; i < N; i++) {
    d[i] = -INF;
  }
  Edge edge;
  vector<Edge> edges;
  for (int i = 0; i < M; i++) {
    int S, E, P;
    scanf("%d%d%d", &S, &E, &P);
    edge.s = S; edge.e = E; edge.pr = -P;
    edges.push_back(edge);
  }
  for (int i = 0; i < N; i++) {
    scanf("%lld", &p[i]);
  }
  d[startCity] = p[startCity];

  bool gee = false;
  for (int k = 0; k < 2; k++) {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        int s = edges[j].s; int e = edges[j].e; int pr = edges[j].pr;
        if (d[s] == -INF) continue;
        else if (d[s] == INF) d[e] = INF;
        else if (d[e] < d[s] + p[e] + pr) {
          d[e] = d[s] + p[e] + pr;
          if (k) d[e] = INF;
        }
      }
    }
  }
  if (d[endCity] == -INF) printf("gg");
  else if (d[endCity] == INF) printf("Gee");
  else printf("%lld", d[endCity]);
}