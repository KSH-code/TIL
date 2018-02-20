#include <cstdio>
#include <queue>
/**
 * https://www.acmicpc.net/problem/1966
 * BOJ 백준온라인져지 1966 프린터 큐 풀이
 */
using namespace std;
int main () {
  int testcase;
  scanf("%d", &testcase);
  while (testcase--) {
    int N, M;
    scanf("%d%d", &N, &M);
    queue<pair<int, int> > q_document;
    priority_queue<int> pq_document;
    for (int i = 0; i < N; i++) {
      int priority;
      scanf("%d", &priority);
      q_document.push(make_pair(priority, i));
      pq_document.push(priority);
    }
    while (pq_document.size()) {
      int priority = q_document.front().first; int m = q_document.front().second;
      q_document.pop();
      if (pq_document.top() == priority) {
        if (m == M) {
          printf("%d\n", N - pq_document.size() + 1);
          break;
        }
        pq_document.pop();
      } else q_document.push(make_pair(priority, m));
    }
  }
}
