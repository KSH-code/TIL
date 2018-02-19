#include <stdio.h>
int main(){
    int N,M,L,i,temp_w,temp_h;
    long temp,area;
    scanf("%d %d %d",&N,&M,&L);
    int H[N],W[M];
    long result[L];
    for(i = 0;i<N;i++){
        scanf("%d",&H[i]);
    }
    for(i = 0;i<M;i++){
        scanf("%d",&W[i]);
    }
    for(i = 0;i<L;i++){
        result[i]=0;
    }
    area=M*N;
    for(i = 1;i<=L;i++){
        temp=i;
        while(temp<=area){
            temp_w=(int)((temp-1)%M);
            temp_h=(int)((temp-1)/M);
            result[i-1]+=W[temp_w]*H[temp_h];
            temp+=L;
        }
    }
    for(i = 0;i<L;i++){
        printf("%ld\n",result[i]);
    }
    return 0;
}