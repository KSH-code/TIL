#include <cstdio>
/**
 * https://www.acmicpc.net/problem/14487
 * BOJ 백준온라인져지 14487 욱제는 효도쟁이야!! 풀이
 */
using namespace std;
int main () {
  int N = 0, max = 0, result = 0;
  scanf("%d", &N);
  while (N--) {
    int temp = 0;
    scanf("%d", &temp);
    if (max < temp) max = temp;
    result += temp;
  }
  printf("%d", result - max);
}
