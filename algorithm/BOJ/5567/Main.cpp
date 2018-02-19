#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/5567
 * BOJ 백준온라인져지 5567 결혼식 풀이
 */
using namespace std;
int main () {
  int N = 0;
  scanf("%d", &N);
  N++;
  int *friends = new int[N];
  int edgeLength;
  scanf("%d", &edgeLength);
  vector<pair<int, int> > edges;
  for (int i = 0; i < edgeLength; i++){
    int s, e;
    scanf("%d%d", &s, &e);
    if (s == 1) friends[e] = 1;
    else if (e == 1) friends[s] = 1;
    else edges.push_back(make_pair(s, e));
  }
  for (int i = 0; i < edges.size(); i++) {
    int s = edges[i].first; int e = edges[i].second;
    if (friends[s] == 1 && friends[e] == 0) friends[e] = 2;
    else if (friends[e] == 1 && friends[s] == 0) friends[s] = 2;
  }
  int result = 0;
  for (int i = 0; i < N; i++) {
    if (friends[i] == 1 || friends[i] == 2) result++;
  }
  printf("%d", result);
}
