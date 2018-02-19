#include <cstdio>
/**
 * https://www.acmicpc.net/problem/6359
 * BOJ 백준온라인져지 6359 만취한 상범 풀이
 */

int main(){
    int *openList = new int[101];
    int testCase;
    scanf("%d", &testCase);
    while(testCase--){
        int numberOfRoom;
        scanf("%d", &numberOfRoom);
        if(!openList[numberOfRoom])
            for(int i = 1; i * i <= numberOfRoom; i++) 
                openList[numberOfRoom]++;
        printf("%d\n", openList[numberOfRoom]);
    }
}