#include <cstdio>
/**
 * https://www.acmicpc.net/problem/4948
 * BOJ 백준온라인져지 4948 베르트랑 공준 풀이
 */
int main(){
    int N = 1;
    bool isPrime[123456*2+1] = {};
    for(int i=2; i<=123456*2; i++) isPrime[i]=true;
	for(int i=2; (i*i)<=123456*2; i++){
		if(isPrime[i]){
			for(int j=i*i; j<=123456*2; j+=i) isPrime[j]=false;
		}
	}
    while(1){
        scanf("%d",&N);
        if(N == 0) break;
        int result = 0;
        for(int i = N+1,length=2*N; i<=length; i++){
            if(isPrime[i]) result++;
        }
        printf("%d\n",result);
    }
    return 0;
}