#include <cstdio>
/**
 * https://www.acmicpc.net/problem/14924
 * BOJ 백준온라인져지 14924 폰 노이만과 파리 풀이
 */

int main(){
    int trainVelocity, aFlyVelocity, distance;
    scanf("%d%d%d", &trainVelocity, &aFlyVelocity, &distance);
    printf("%d", distance / (trainVelocity * 2) * aFlyVelocity);
}