#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1085
 * BOJ 백준온라인져지 1085 직사각형에서 탈출 풀이
 */
int min(int a, int b){
    return a>b?b:a;
}
int main(){
    int x,y,w,h;
    scanf("%d%d%d%d",&x,&y,&w,&h);
    int result = min(x,y);
    result = min(min(w-x,result),h-y);
    printf("%d", result);
}