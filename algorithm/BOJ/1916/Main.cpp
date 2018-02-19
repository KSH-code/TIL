#include <cstdio>
#include <vector>
#include <queue>
/**
 * https://www.acmicpc.net/problem/1916
 * BOJ 백준온라인져지 1916 최소비용 구하기 풀이
 */
#define INF 1100000000
struct Edge{
    int v, w;
};
using namespace std;
int main(){
    int city, bus;
    scanf("%d%d", &city, &bus);

    int *distance = new int[city + 1];
    Edge edge;

    vector<vector<Edge> > edges;
    edges.resize(1001);

    for(int i = 1; i <= bus; i++){
        int u, v, w;
        scanf("%d%d%d", &u, &v, &w);
        edge.v = v;
        edge.w = w;
        edges[u].push_back(edge);
    }

    for(int i = 1; i <= city; i++){
        distance[i] = INF;
    }

    int start, end;
    scanf("%d%d", &start, &end);

    distance[start] = 0;
    
    bool *visited = new bool[city + 1];
    priority_queue<pair<int, int> > pq;
    pq.push(make_pair(0, start));
    while(pq.size()){
        int here = pq.top().second;
        int hereDist = pq.top().first;
        pq.pop();
        for (int i = 0, size = edges[here].size(); i < size; i++) {
            int there = edges[here][i].v;
            int nextDist = hereDist + edges[here][i].w;
            if (distance[there] > nextDist) {
                distance[there] = nextDist;
                pq.push(make_pair(distance[there], there));
            }
        }
    }
    printf("%d", distance[end]);
}