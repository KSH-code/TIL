#include <iostream>
using namespace std;
int main() {
    float a = 8196.00000001;
    double b = 8196.00000002;
    double c = 8196.00000002;
    cout << (a == b) << "\n";
    cout << (b == c) << "\n";
    cout << (c != a) << "\n";
    if (a == b && b == c && c != a) {
        cout << "true" << '\n';
    } else {
        cout << "false" << '\n';
    }
    return 0;
}
