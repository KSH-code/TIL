#include <cstdio>
#include <string.h>
/**
 * https://www.acmicpc.net/problem/1076
 * BOJ 백준온라인져지 1076 저항 풀이
 */
using namespace std;
int main () {
  char colors[10][9] = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
  char color[9];
  long long result = 0;
  scanf("%s", &color);
  for (int i = 0; i < 10; i++) {
    if (strcmp(color, colors[i]) == 0) {
      result += 10 * i;
    }
  }
  scanf("%s", &color);
  for (int i = 0; i < 10; i++) {
    if (strcmp(color, colors[i]) == 0) {
      result += i;
    }
  }
  scanf("%s", &color);
  for (int i = 0; i < 10; i++) {
    if (strcmp(color, colors[i]) == 0) {
      for (int j = 0; j < i; j++) {
        result *= 10;
      }
    }
  }
  printf("%lld", result);
}
