#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/11403
 * BOJ 백준온라인져지 11403 경로 찾기 풀이
 */
using namespace std;

long long cnt = 0;
vector<int> aa, gg;
void sort(vector<int> &a) {
    if (a.size() <= 1) return;
    int pivot = a[(a.size()-1)/2];
    int n = a.size();
    for (int i=0; i<n; i++) {
        cnt += 1;
        if (a[i] < pivot) {
            aa.push_back(a[i]);
        } else if (a[i] > pivot) {
            gg.push_back(a[i]);
        }
    }
    sort(aa);
    sort(gg);
}
int main(){
    vector<int> a;
    int N;
    scanf("%d",&N);
    while(N--){
        int temp;
        scanf("%d",&temp);
        a.push_back(temp);
    }
    sort(a);
    printf("%lld",cnt);
}