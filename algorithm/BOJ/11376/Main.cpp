#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/11376
 * BOJ 백준온라인져지 11376 열혈강호 2 풀이
 */
using namespace std;
vector<vector<int> > adj;
vector<int> match;
vector<bool> visited;
int workCount;
bool dfs (int here) {
  if (visited[here]) return false;
  visited[here] = true;
  for (int there = 1; there <= workCount; there++) {
    if (adj[here][there]) {
      if (match[there] == -1 || dfs(match[there])) {
        match[there] = here;
        return true;
      }
    }
  }
  return false;
}
int main () {
  int personCount;
  scanf("%d%d", &personCount, &workCount);
  adj.resize(personCount + 1);
  for (int i = 1; i <= personCount; i++) {
    adj[i].resize(workCount + 1);
    int length;
    scanf("%d", &length);
    for (int j = 0; j < length; j++) {
      int work;
      scanf("%d", &work);
      adj[i][work] = 1;
    }
  }
  int result = 0;
  match = vector<int>(workCount + 1, -1);
  for (int i = 1; i <= personCount; i++) {
    for (int j = 0; j < 2; j++) {
      visited = vector<bool>(personCount + 1, false);
      if (dfs(i)) result++;
    }
  }
  printf("%d", result);
}