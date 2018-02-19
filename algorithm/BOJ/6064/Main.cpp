#include <cstdio>
/**
 * https://www.acmicpc.net/problem/6064
 * BOJ 백준온라인져지 6064 카잉 달력 풀이
 */
int lcm(int a, int b);
int gcd(int a, int b);
int main(){
    
    int T;
    scanf("%d", &T);
    while(T--){
        int M,N,x,y;
        scanf("%d%d%d%d",&M,&N,&x,&y);
        if(M > N){
            int temp;
            temp = N, N = M, M = temp;
            temp = x, x = y, y = temp;
        }
        int _lcm = lcm(M,N);
        if(x>=N) printf("-1\n");
        else{
            int result = x, tempy = x;
            while(y!=tempy&&_lcm>result){
                tempy += M;
                result += M;
                if(tempy > N) tempy %= N;
            }
            if(_lcm<result||(tempy!=y&&_lcm==result)) printf("-1\n");
            else printf("%d\n",result);
        }
    }
    return 0;
}
int gcd(int a, int b){
    if(a == 0)
        return b;
    return gcd(b%a, a);
}
int lcm(int a, int b){
    return a * b / gcd(a, b);
}
/* 첫 번째 풀이
int gcd(int a, int b){
    if(a == 0)
        return b;
    return gcd(b%a, a);
}
int lcm(int a, int b){
    return a * b / gcd(a, b);
}
int main(){
    int T;
    scanf("%d", &T);
    while(T--){
        int M,N,x,y,cnt = -1,tempx=0,tempy=0;
        scanf("%d%d%d%d",&M,&N,&x,&y);
        for(int i = 0, _lcm = lcm(M,N); i<_lcm; i++){
            tempx = tempx % M + 1;
            tempy = tempy % N + 1;
            if(x == tempx && y == tempy){
                cnt = ++i;
                break;
            }
        }
        printf("%d\n", cnt);
    }
    return 0;
}
*/