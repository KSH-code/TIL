#include <stdio.h>
int main () {
  printf("1");
  execlp("echo", "echo", "3", NULL);
  printf("2");
  return 0;
}