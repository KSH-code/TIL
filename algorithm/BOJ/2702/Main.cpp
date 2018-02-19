#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2702
 * BOJ 백준온라인져지 2702 초6 수학 풀이
 */
int gcd(int a, int b){
    int mod = 0;
    while((mod = a % b)){
        a = b;
        b = mod;
    }
    return b;
}
int main(){
    int testCase;
    scanf("%d", &testCase);
    while(testCase--){
        int A, B;
        scanf("%d%d", &A, &B);
        printf("%d %d\n", A * B / gcd(A, B), gcd(A, B));
    }
}