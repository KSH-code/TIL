#include <cstdio>
#include <vector>
/**
 * https://www.acmicpc.net/problem/14927
 * BOJ 백준온라인져지 14927 전구 끄기 풀이
 */
using namespace std;

int yyyy[] = {0, 0, 1, 0, -1};
int xxxx[] = {0, -1, 0, 1, 0};
int result = 1e9, N;
int min (int a, int b) {
    return a < b ? a : b;
}

void recursive2 (vector<vector<int> > lights, int count) {
    for (int i = 2; i < N; i++) {
        for (int j = 1; j < N; j++) {
            if (lights[i - 1][j]) {
                count++;
                for (int k = 0; k < 5; k++) {
                    int x = i + xxxx[k], y = j + yyyy[k];
                    if (x <= 0 || y <= 0 || x >= N || y >= N) continue;                
                    lights[x][y] = lights[x][y] * -1 + 1;
                }
            }
        }
    }
    bool isBreaked = false;
    for (int i = 1; i < N; i++) {
        for (int j = 1; j < N; j++) {
            if (lights[i][j]) {
                isBreaked = true;
                goto breakLoop;
            }
        }
    }
    breakLoop:
    if (!isBreaked) result = min(count, result);
}

void recursive1 (vector<vector<int> > lights, int length) {
    int count = 0;
    for (int i = 0; i < N - 1; i++) {
        if (length & 1 << i) {
            count++;
            for (int k = 0; k < 5; k++) {
                int x = 1 + xxxx[k], y = i + 1 + yyyy[k];
                if (x <= 0 || y <= 0 || x >= N || y >= N) continue;                
                lights[x][y] = lights[x][y] * -1 + 1;
            }
        }
    }
    recursive2(lights, count);
}

int main () {
    scanf("%d", &N);
    N++;
    vector<vector<int> > originalLights;
    originalLights.resize(N);
    for (int i = 1; i < N; i++) {
        originalLights[i].resize(N);
        for (int j = 1; j < N; j++) {
            scanf("%d", &originalLights[i][j]);
        }
    }
    for (int i = (1 << (N - 1)) - 1; i >= 0; i--) {
        recursive1(originalLights, i);
    }
    printf("%d", result == 1e9 ? -1 : result);
}
