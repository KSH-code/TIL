#include <cstdio>
#include <queue>
#include <vector>
/**
 * https://www.acmicpc.net/problem/1005
 * BOJ 백준온라인져지 1005 ACM Craft 풀이
 */
int max(int a, int b) {
    return a > b ? a : b;
}
using namespace std;
int main() {
    int testCase;
    scanf("%d", &testCase);
    while(testCase--) {
        int numberOfVertex;
        int numberOfEdge;
        scanf("%d%d", &numberOfVertex, &numberOfEdge);
        numberOfVertex++;
        int *minimumSecond = new int[numberOfVertex];
        int *second = new int[numberOfVertex];
        int *indegree = new int[numberOfVertex];
        for(int i = 1; i < numberOfVertex; i++) {
            indegree[i] = second[i] = minimumSecond[i] = 0;
            scanf("%d", &second[i]);
        }
        queue<int> queue;
        vector<vector<int> > vector;
        vector.resize(numberOfVertex);
        for(int i = 0; i < numberOfEdge; i++) {
            int startVertex;
            int endVertex;
            scanf("%d%d", &startVertex, &endVertex);
            vector[startVertex].push_back(endVertex);
            indegree[endVertex]++;
        }
        for(int i = 1; i < numberOfVertex; i++) {
            if(indegree[i] == 0) queue.push(i), minimumSecond[i] = second[i];
        }
        int endVertex;
        scanf("%d", &endVertex);
        while(queue.size()) {
            int cur = queue.front();
            queue.pop();
            for(int i = 0, size = vector[cur].size(); i < size; i++) {
                int next = vector[cur][i];
                indegree[next]--;
                minimumSecond[next] = max(minimumSecond[next], minimumSecond[cur] + second[next]);
                if(indegree[next] == 0) queue.push(next);
            }
        }
        printf("%d\n", minimumSecond[endVertex]);
    }
}