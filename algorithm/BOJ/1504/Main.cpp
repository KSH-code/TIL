#include <cstdio>
#include <queue>
#include <vector>
/**
 * https://www.acmicpc.net/problem/1504
 * BOJ 백준온라인져지 1504 특정한 최단 경로 풀이
 */
#define INF 1e+9
using namespace std;
int vertexCount;
vector<vector<pair<int, int> > > edges;
int dijkstra (int start, int end) {
    int *distance = new int[vertexCount];
    distance[start] = 0;
    priority_queue<pair<int, int> > queue;
    queue.push(make_pair(0, start));
    for (int i = 1; i < vertexCount; i++) {
        if (start == i) continue;
        distance[i] = INF;
    }
    while (queue.size()) {
        int start = queue.top().second, startDist = queue.top().first;
        queue.pop();
        for (int i = 0; i < edges[start].size(); i++) {
            int there = edges[start][i].first;
            int newDist = startDist + edges[start][i].second;
            if (distance[there] > newDist) {
                distance[there] = newDist;
                queue.push(make_pair(newDist, there));
            }
        }
    }
    return distance[end];
}
int main () {
    int edgeCount;
    scanf("%d%d", &vertexCount, &edgeCount);

    edgeCount++, vertexCount++;
    edges.resize(vertexCount);

    for (int i = 1; i < edgeCount; i++) {
        int u, v, w;
        scanf("%d%d%d", &u, &v, &w);
        edges[u].push_back(make_pair(v, w));
        edges[v].push_back(make_pair(u, w));
    }
    int v1, v2;
    scanf("%d%d", &v1, &v2);
    int result = INF;
    int temp = dijkstra(1, v1);
    if (temp != INF) {
        int temp2 = dijkstra(v1, v2);
        if (temp2 != INF) {
            int temp3 = dijkstra(v2, vertexCount - 1);
            if (temp3 != INF) {
                result = temp + temp2 + temp3;
            }
        }
    }
    temp = dijkstra(1, v2);
    if (temp != INF) {
        int temp2 = dijkstra(v2, v1);
        if (temp2 != INF) {
            int temp3 = dijkstra(v1, vertexCount - 1);
            if (temp3 != INF) {
                if (result > temp + temp2 + temp3)
                    result = temp + temp2 + temp3;
            }
        }
    }


    printf("%d", result == INF ? -1 : result);
}