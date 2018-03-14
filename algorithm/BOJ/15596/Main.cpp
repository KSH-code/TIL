#include <vector>
long long sum(std::vector<int> &a) {
    long long result = 0;
    for (int i = 0, size = a.size(); i < size; i++) {
        result += a[i];
    }
    return result;
}