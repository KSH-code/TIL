#include <cstdio>
#include <queue>
#include <vector>
/**
 * https://www.acmicpc.net/problem/1766
 * BOJ 백준온라인져지 1766 문제집 풀이
 */
using namespace std;
int main () {
    int numberOfVector;
    int numberOfEdge;
    scanf("%d%d", &numberOfVector, &numberOfEdge);
    numberOfVector++;
    numberOfEdge++;

    int *indegree = new int[numberOfVector];
    vector<vector<int> > edges;
    edges.resize(numberOfVector);
    for (int i = 1; i < numberOfVector; i++) {
        indegree[i] = 0;
    }
    for (int i = 1; i < numberOfEdge; i++) {
        int firstSolve;
        int lastSolve;
        scanf("%d%d", &firstSolve, &lastSolve);
        edges[firstSolve].push_back(lastSolve);
        indegree[lastSolve]++;
    }
    priority_queue<int, vector<int>, greater<int> > queue;
    for (int i = 1; i < numberOfVector; i++) {
        if (indegree[i] == 0) queue.push(i);
    }

    while (queue.size()) {
        int here = queue.top();
        queue.pop();
        printf("%d\n", here);
        for (int i = 0, size = edges[here].size(); i < size; i++) {
            int there = edges[here][i];
            indegree[there]--;
            if (indegree[there] == 0) queue.push(there);
        }
    }
}