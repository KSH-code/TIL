#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2711
 * BOJ 백준온라인져지 2711 오타맨 고창영 풀이
 */

int main(){
    char *word = new char[81];
    int testCase;
    scanf("%d", &testCase);
    while(testCase--){
        int index;
        scanf("%d", &index);
        int i = 0;
        while(1){
            char temp;
            scanf("%c", &temp);
            if(temp == ' ') continue;
            if(temp >= 'A' && temp <= 'Z') word[i++] = temp;
            else break;
        }
        for(int ii = 0; ii < i; ii++){
            if(ii == index - 1) continue;
            printf("%c", word[ii]);
        }
        printf("\n");
    }
}