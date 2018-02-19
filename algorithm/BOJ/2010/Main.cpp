#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2010
 * BOJ 백준온라인져지 2010 플러그 풀이
 */
int main () {
  long long result = 0;
  int testcase = 0;
  scanf("%d", &testcase);
  while (testcase--) {
    int temp = 0;
    scanf("%d", &temp);
    result += temp - 1;
  }
  printf("%lld", result + 1);
}
