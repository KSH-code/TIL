#include <stdio.h>
int countObvious (int n) {
    int same = 0;
    for (int x = 1; x <= n; x++) {
        double y = 1.0 / x;
        if (y * x == 1.0) same++;
        else printf("%lf\n", y * x);
    }
    return same;
}
int main () {
    printf("%d", countObvious(50));
}