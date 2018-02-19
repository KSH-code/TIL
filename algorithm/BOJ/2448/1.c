
#include<stdio.h>
int n, a[3072][6146];
int main() {
    scanf("%d", &n);
    a[0][n - 1] = a[1][n - 2] = 
    a[1][n] = a[2][n - 3] = a[2][n - 2] = 
    a[2][n - 1] = a[2][n] = a[2][n + 1] = 1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 2 * n - 1; j++) {
            if (i > 2) a[i][j] = (j>2 && a[i - 3][j - 3]) ^ a[i - 3][j + 3];
            putchar(" *"[a[i][j]]);
        }
        puts("");
    }
    return 0;
}
