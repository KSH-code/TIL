#include <cstdio>
#include <queue>
#include <vector>
/**
 * https://www.acmicpc.net/problem/2822
 * BOJ 백준온라인져지 2822 점수 계산 풀이
 */
using namespace std;

int main () {
    priority_queue<pair<int, int> > a;
    priority_queue<int, vector<int>, greater<int> > b;
    for (int i = 1; i <= 8; i++) {
        int temp;
        scanf("%d", &temp);
        a.push(make_pair(temp, i));
    }
    int result = 0;
    for (int i = 0; i < 5; i++) {
        int grade = a.top().first;
        int idx = a.top().second;
        b.push(idx);
        a.pop();
        result += grade;
    }
    printf("%d\n", result);
    for(int i = 0; i < 5; i++) {
        printf("%d ", b.top());
        b.pop();
    }
}