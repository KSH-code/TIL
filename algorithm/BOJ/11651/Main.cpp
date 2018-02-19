#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/11651
 * BOJ 백준온라인져지 11651 좌표 정렬하기 2 풀이
 */
using namespace std;
void quickSort(vector<long> &arr, int left, int right) {
      int i = left, j = right;
      long pivot = arr[(left + right) / 2];
      long temp;
      do {
        while (arr[i] < pivot) 
            i++;
        while (arr[j] > pivot)
            j--;
        if (i <= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
	} while (i <= j);

    /* recursion */
    if (left < j)
        quickSort(arr, left, j);

    if (i < right)
        quickSort(arr, i, right);
}
int main(){
    
    int T;
    scanf("%d",&T);

    vector<long> pointList;
    while(T--){
        long x1,y1;
        scanf("%ld%ld",&x1,&y1);
        pointList.push_back((y1+100000)*1000000+(x1+100000));
    }
    quickSort(pointList, 0, pointList.size()-1);

    for(int i = 0, size = pointList.size(); i<size; i++){
        long y = pointList[i] / 1000000 - 100000;
        long x = pointList[i] % 1000000 - 100000;
        printf("%ld %ld\n",x,y);
    }

    return 0;
}