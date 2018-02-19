#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2490
 * BOJ 백준온라인져지 2490 윷놀이 풀이
 */
char arr[5] = {'E', 'A', 'B', 'C', 'D'};
int main(){
    for(int i = 0; i<3; i++){
        int count = 4;
        for(int j = 0; j<4; j++){
            int temp;
            scanf("%d", &temp);
            count -= temp;
        }
        printf("%c\n", arr[count]);
    }
}