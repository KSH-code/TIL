#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1916
 * BOJ 백준온라인져지 1916 최소비용 구하기 풀이
 */
#define INF 1100000000
int main(){
    int vertexSize, edgeSize, X;
    scanf("%d%d%d", &vertexSize, &edgeSize, &X);

    int *distance1 = new int[vertexSize + 1];
    int *distance2 = new int[vertexSize + 1];

    int **edges = new int*[vertexSize + 1];
    for(int i = 1; i <= vertexSize; i++) edges[i] = new int[vertexSize + 1];
    for(int i = 1; i <= vertexSize; i++) for(int j = 1; j <= vertexSize; j++) edges[i][j] = INF;

    for(int i = 1; i <= edgeSize; i++){
        int u, v, w;
        scanf("%d%d%d", &u, &v, &w);
        edges[u][v] = w;
    }

    for(int i = 1; i <= vertexSize; i++){
        distance1[i] = distance2[i] = INF;
    }
    distance2[X] = distance1[X] = 0;
    bool *visited = new bool[vertexSize + 1];
    bool done = true;
    int bt, t;
    while(1){
        done = true, bt = INF;
        for(int i = 1; i <= vertexSize; i++){
            if(!visited[i] && distance1[i] != INF){
                if (bt == INF || distance1[i] < bt) { t = i, bt = distance1[i];}
                done = false;
            }
        }
        if(done) break;
        for(int i = 1; i <= vertexSize; i++){
			if (edges[t][i] != INF)
				if (distance1[i] == INF || distance1[t] + edges[t][i] < distance1[i])
					distance1[i] = distance1[t] + edges[t][i];
		}
		visited[t] = true;
    }
    visited = new bool[vertexSize + 1];
    while(1){
        done = true, bt = INF;
        for(int i = 1; i <= vertexSize; i++){
            if(!visited[i] && distance2[i] != INF){
                if (bt == INF || distance2[i] < bt) { t = i, bt = distance2[i];}
                done = false;
            }
        }
        if(done) break;
        for(int i = 1; i <= vertexSize; i++){
			if (edges[i][t] != INF)
				if (distance2[i] == INF || distance2[t] + edges[i][t] < distance2[i])
					distance2[i] = distance2[t] + edges[i][t];
		}
		visited[t] = true;
    }
    int result = 0;
    for(int i = 1; i <= vertexSize; i++) if(result < distance1[i] + distance2[i]) result = distance1[i] + distance2[i];
    printf("%d", result);
}