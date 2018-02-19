#include <cstdio>
#include <queue>
/**
 * https://www.acmicpc.net/problem/1715
 * BOJ 백준온라인져지 1715 카드 정렬하기 풀이
 */
using namespace std;
int main () {
    int cardCount;
    scanf("%d", &cardCount);
    priority_queue<int, vector<int>, greater<int> > queue;
    while (cardCount--) {
        int temp;
        scanf("%d", &temp);
        queue.push(temp);
    }
    int result = 0;
    while (queue.size() > 1) {
        // a + b + ((a + b) + c)
        // result = (a + b)
        int a = queue.top(); queue.pop();
        int b = queue.top(); queue.pop();
        result += a + b;
        queue.push(a + b);
    }
    printf("%d", result);
}