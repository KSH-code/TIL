#include <cstdio>
#include <stack>
/**
 * https://www.acmicpc.net/problem/1918
 * BOJ 백준온라인져지 1918 후위표기식 풀이
 */
using namespace std;
int getPriority (char op) {
    switch (op) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '(':
            return -1;
        default:
            return 0;
    }
}
int main () {
    stack<char> op;
    char temp;
    while (scanf("%c", &temp) != EOF) {
        if (getPriority(temp)) {
            while (op.size() && temp != '(' && getPriority(temp) <= getPriority(op.top())) {
                printf("%c", op.top());
                op.pop();
            }
            op.push(temp);
        } else {
            if (temp == ')') {
                while (op.top() != '(') {
                    printf("%c", op.top());
                    op.pop();
                }
                op.pop();
            } else {
                if (temp >= 'A' && temp <= 'Z') printf("%c", temp);
            }
        }
    }
    while (op.size()) {
        printf("%c", op.top());
        op.pop();
    }
}