#include <cstdio>
#include <queue>
#include <vector>
/**
 * https://www.acmicpc.net/problem/14502
 * BOJ 백준온라인져지 14502 연구소 풀이
 */
using namespace std;
int xxxx[] = {0, 1, 0, -1};
int yyyy[] = {-1, 0, 1, 0};
vector<pair<int, int> > virusZone;
int row, col, result = 0;
int bfs (int **map) {
  bool **visited = new bool*[row];
  for (int i = 0; i < row; i++) {
    visited[i] = new bool[col];
    for (int j = 0; j < col; j++) {
      visited[i][j] = false;
    }
  }
  
  queue<pair<int, int> > q;
  for (int i = 0; i < virusZone.size(); i++) {
    q.push(virusZone[i]);
  }

  while (q.size()) {
    int x = q.front().first; int y = q.front().second; q.pop();
    visited[x][y] = true;
    map[x][y] = 2;
    for (int i = 0; i < 4; i++) {
      int nx = x + xxxx[i]; int ny = y + yyyy[i];
      if (nx < 0 || ny < 0 || nx >= row || ny >= col || visited[nx][ny] || map[nx][ny]) continue;
      q.push(make_pair(nx, ny));
    }
  }

  int tempSafetyZone = 0;
  for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
      if (map[i][j] == 0) {
        tempSafetyZone++;
      }
    }
  }
  return tempSafetyZone;
}
int main () {
  scanf("%d%d", &row, &col);
  int **map = new int*[row];
  vector<pair<int, int> > safetyZone;
  for (int i = 0; i < row; i++) {
    map[i] = new int[col];
    for (int j = 0; j < col; j++) {
      scanf("%d", &map[i][j]);
      if (map[i][j] == 0) safetyZone.push_back(make_pair(i, j));
      else if (map[i][j] == 2) virusZone.push_back(make_pair(i, j));
    }
  }

  for (int i = 0; i < safetyZone.size() - 2; i++) {
    for (int j = i + 1; j < safetyZone.size() - 1; j++) {
      for (int k = j + 1; k < safetyZone.size(); k++) {
        int **tempMap = new int*[row];
        for (int ii = 0; ii < row; ii++) {
          tempMap[ii] = new int[col];
          for (int jj = 0; jj < col; jj++) {
            tempMap[ii][jj] = map[ii][jj];
          }
        }
        tempMap[safetyZone[i].first][safetyZone[i].second] = 1;
        tempMap[safetyZone[j].first][safetyZone[j].second] = 1;
        tempMap[safetyZone[k].first][safetyZone[k].second] = 1;
        int tempResult = bfs(tempMap);
        if (result < tempResult) {
          result = tempResult;
        }
      }
    }
  }
  printf("%d", result);
}