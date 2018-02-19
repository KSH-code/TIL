#include <cstdio>
#include <queue>
#include <vector>
/**
 * https://www.acmicpc.net/problem/2623
 * BOJ 백준온라인져지 2623 음악프로그램 풀이
 */
using namespace std;
int main () {
    int numberOfVector;
    int testCase;
    scanf("%d%d", &numberOfVector, &testCase);
    numberOfVector++;
    int *indegree = new int[numberOfVector];
    vector<vector<int> > edges;
    edges.resize(numberOfVector);
    for (int i = 1; i < numberOfVector; i++) {
        indegree[i] = 0;
    }
    while (testCase--) {
        int numberOfEdge;
        int firstSinger;
        scanf("%d%d", &numberOfEdge, &firstSinger);
        for (int i = 1; i < numberOfEdge; i++) {
            int lastSinger;
            scanf("%d", &lastSinger);
            indegree[lastSinger]++;
            edges[firstSinger].push_back(lastSinger);
            firstSinger = lastSinger;
        }
    }

    queue<int> result;
    queue<int> queue;
    for (int i = 1; i < numberOfVector; i++) {
        if (indegree[i] == 0) queue.push(i);
    }
    while (queue.size()) {
        int here = queue.front();
        queue.pop();
        result.push(here);
        for (int i = 0, size = edges[here].size(); i < size; i++) {
            int there = edges[here][i];
            indegree[there]--;
            if (indegree[there] == 0) queue.push(there);
        }
    }
    if(result.size() == numberOfVector - 1) {
        while(result.size()) {
            printf("%d\n", result.front());
            result.pop();
        }
    } else {
        printf("0");
    }
}