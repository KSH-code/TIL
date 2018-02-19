#include <cstdio>
#include <queue>
#include <string.h>
/**
 * https://www.acmicpc.net/problem/1261
 * BOJ 백준온라인져지 1261 알고스팟 풀이
 */
using namespace std;
int xxxx[] = {0, 1, 0, -1};
int yyyy[] = {-1, 0, 1, 0};
struct node {
    int x, y, w;
    node (int x, int y, int w): x(x), y(y), w(w) {}
    bool operator < (node other) const {
        return w > other.w;
    }
};
int main () {
    int row, col;
    scanf("%d%d", &col, &row);
    bool visited[row][col];
    char map[row][col];
    for (int i = 0; i < row; i++) {
        scanf("%s", map[i]);
    }
    memset(visited, 0, sizeof(visited));
    priority_queue<node> pq;
    pq.push(node(0, 0, 0));
    while(pq.size()) {
        node n = pq.top(); pq.pop();

        int cx = n.x; int cy = n.y; int cw = n.w;
        if (cx == row - 1 && cy == col - 1) {
            printf("%d", cw);
            break;
        }
        visited[cx][cy] = true;
        for (int i = 0; i < 4; i++) {
            int nx = cx + xxxx[i]; int ny = cy + yyyy[i];
            if (visited[nx][ny] || nx < 0 || ny < 0 || nx >= row || ny >= col) continue;
            int nw = cw + map[nx][ny] - 48;
            pq.push(node(nx, ny, nw));
        }
    }
}