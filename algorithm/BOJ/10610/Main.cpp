#include <cstdio>
#include <string.h>
/**
 * https://www.acmicpc.net/problem/10610
 * BOJ 백준온라인져지 10610 30 풀이
 */
using namespace std;
int main () {
  char stringNumber[100002];
  int number[10];
  int sum = 0;
  scanf("%s", stringNumber);
  int size = strlen(stringNumber);
  for (int i = 0; i < size; i++) {
    int n = stringNumber[i] - '0';
    number[n]++;
    sum += n;
  }
  if (sum % 3 == 0 && number[0]) {
    for (int i = 9; i >= 0; i--)
      while (number[i]) {
        printf("%d", i);
        number[i]--;
      }
  } else printf("-1");
}
