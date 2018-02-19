#include <cstdio>
/**
 * https://www.acmicpc.net/problem/9020
 * BOJ 백준온라인져지 9020 골드바흐의 추측 풀이
 */
#define MAX 10001
int main(){
    bool isPrime[MAX-1] = {};
    for(int i=2; i<MAX; i++) isPrime[i]=true;
	for(int i=2; (i*i)<MAX; i++){
		if(isPrime[i]){
			for(int j=i*i; j<MAX; j+=i) isPrime[j]=false;
		}
    }

    int idx = 0;
    int primeNumber[MAX-1] = {};
    for(int i = 2; i<MAX; i++) if(isPrime[i]) primeNumber[idx++] = i;
    int N;
    scanf("%d",&N);
    while(N--){
        int n;
        scanf("%d",&n);
        int min = MAX, tempI = 0, tempJ = 0, result = 0;
        for(int i = 0; i < idx && result < n; i++){
            result = primeNumber[i];
            for(int j = i; j < idx && result + primeNumber[j] <= n; j++){
                if(result + primeNumber[j] == n){
                    int subtraction = primeNumber[j] - result;
                    if(min > subtraction){
                        min = subtraction;
                        tempI = i;
                        tempJ = j;
                    }
                }
            }
        }
        printf("%d %d\n",primeNumber[tempI],primeNumber[tempJ]);
    }
    return 0;
}