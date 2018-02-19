#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1931
 * BOJ 백준온라인져지 1931 회의실배정 풀이
 */
struct Time{
    int startTime, endTime;
};
bool isBiggerAThanB(Time &A, Time &B){
    if(A.endTime == B.endTime)
        return A.startTime > B.startTime;
    return A.endTime > B.endTime;
}
Time timeList[100001];
Time tempTimeList[100001];
void mergeSort(int l, int r){
    if(l < r){
        int mid = (l + r) / 2;
        mergeSort(l, mid);
        mergeSort(mid + 1, r);
        
        int i = l, j = mid + 1, k = l, cnt = 0;
        while(i <= mid && j <= r){
            if(isBiggerAThanB(timeList[i], timeList[j]))
                tempTimeList[k++] = timeList[j++];
            else
                tempTimeList[k++] = timeList[i++];
        }
        while(i <= mid){
            tempTimeList[k++] = timeList[i++];
        }
        while(j <= r){
            tempTimeList[k++] = timeList[j++];
        }
        while(l <= r){
            timeList[l] = tempTimeList[l];
            l++;
        }
    }
}

int main(){
    int N;
    scanf("%d", &N);

    for(int i = 0; i < N; i++){
        scanf("%d%d", &timeList[i].startTime, &timeList[i].endTime);
    }

    mergeSort(0, N - 1);
    
    int result = 0, endTime = -1;

    for(int i = 0; i < N; i++){
        if(timeList[i].startTime >= endTime){
            result++, endTime = timeList[i].endTime;
        }
    }

    printf("%d", result);
}