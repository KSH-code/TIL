#include <cstdio>
#include <queue>
/**
 * https://www.acmicpc.net/problem/1655
 * BOJ 백준온라인져지 1655 가운데를 말해요 풀이
 */
using namespace std;
priority_queue<int, vector<int>, less<int> > maxHeap;
priority_queue<int, vector<int>, greater<int> > minHeap;
int main () {
    int testCase;
    scanf("%d", &testCase);

    while (testCase--) {
        int temp;
        scanf("%d", &temp);
        if (maxHeap.empty()) maxHeap.push(temp);
        else if (maxHeap.top() < temp) minHeap.push(temp);
        else maxHeap.push(temp);

        if (maxHeap.size() < minHeap.size()) maxHeap.push(minHeap.top()), minHeap.pop();
        else if (maxHeap.size() > minHeap.size() + 1) minHeap.push(maxHeap.top()), maxHeap.pop();
        printf("%d\n", maxHeap.top());
    }
}