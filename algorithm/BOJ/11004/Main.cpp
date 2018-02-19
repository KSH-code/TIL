#include <cstdio>
/**
 * https://www.acmicpc.net/problem/11004
 * BOJ 백준온라인져지 11004 K번째 수 풀이
 */
void swap (int arr[], int i, int j) {
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}
int partition (int arr[], int l, int r) {
  int pivot = arr[l];
  int low = l + 1;
  int high = r;
  while (low <= high) {
    while (pivot >= arr[low] && low <= r) low++;
    while (pivot <= arr[high] && high >= l + 1) high--;
    if (low <= high) swap(arr, low, high);
  }
  swap(arr, l, high);
  return high;
}
int quickSelect (int arr[], int l, int r, int k) {
  int pivot = partition(arr, l, r);
  if (pivot == k) return arr[k];
  else if (pivot < k) return quickSelect(arr, pivot + 1, r, k);
  else return quickSelect(arr, l, pivot - 1, k); // if (pivot > k) 
}
int main () {
  int n, k;
  scanf("%d%d", &n, &k);
  int arr[n];
  for (int i = 0; i < n; i++) scanf("%d", &arr[i]);
  printf("%d", quickSelect(arr, 0, n - 1, k - 1));
}