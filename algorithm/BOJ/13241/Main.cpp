#include <cstdio>
/**
 * https://www.acmicpc.net/problem/13241
 * BOJ 백준온라인져지 13241 최소공배수 풀이
 */
int gcd(long long a, long long b){
    long long mod = 0;
    while((mod = a % b)){
        a = b;
        b = mod;
    }
    return b;
}
int main(){
    long long result = 0;
    long long A, B;
    scanf("%lld%lld", &A, &B);

    printf("%lld", A * B / gcd(A, B));
}