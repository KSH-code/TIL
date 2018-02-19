#include <cstdio>
/**
 * https://www.acmicpc.net/problem/2217
 * BOJ 백준온라인져지 2217 로프 풀이
 */
int ropeList[100001];
int tempRopeList[100001];
void mergeSort(int l, int r){
    if(l < r){
        int mid = (l + r) / 2;
        mergeSort(l, mid);
        mergeSort(mid + 1, r);
        
        int i = l, j = mid + 1, k = l, cnt = 0;
        while(i <= mid && j <= r){
            if(ropeList[j] > ropeList[i])
                tempRopeList[k++] = ropeList[j++];
            else
                tempRopeList[k++] = ropeList[i++];
        }
        while(i <= mid){
            tempRopeList[k++] = ropeList[i++];
        }
        while(j <= r){
            tempRopeList[k++] = ropeList[j++];
        }
        while(l <= r){
            ropeList[l] = tempRopeList[l];
            l++;
        }
    }
}

int main(){
    int N;
    scanf("%d", &N);

    for(int i = 0; i < N; i++){
        scanf("%d", &ropeList[i]);
    }

    mergeSort(0, N - 1);
    
    int result = 0;

    for(int i = 0; i < N; i++){
        if(result < ropeList[i] * (i + 1)) result = ropeList[i] * (i + 1);
    }

    printf("%d", result);
}