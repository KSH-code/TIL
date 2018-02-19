#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1011
 * BOJ 백준온라인져지 1011 Fly me to the Alpha Centauri
 */
int main(){
    long T,x,y,pos,i;
    scanf("%d", &T);
    while(T--){
        scanf("%d%d",&x,&y);
        y-=x,pos=1,i=2;
        while((pos+=i++/2)<y);
        if(pos>y) i--;
        printf("%d\n", i-1);
    }
    return 0;
}