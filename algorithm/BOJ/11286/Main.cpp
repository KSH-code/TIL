
#include <cstdio>
/**
 * https://www.acmicpc.net/problem/11286
 * BOJ 백준온라인져지 11286 절대값 힙 풀이
 */
int heap[100000] = {0}, pos = 0;
int abs (int a) {
    if (a < 0) return -a;
    return a;
}
void push (int number) {
    int curPos = pos;
    heap[curPos] = number;
    int parentPos = (curPos - 1) / 2;
    while (curPos > 0 && (abs(heap[parentPos]) > abs(heap[curPos]) || (abs(heap[parentPos]) == abs(heap[curPos]) && heap[curPos] <= heap[parentPos]))) {
        int temp = heap[curPos];
        heap[curPos] = heap[parentPos];
        heap[parentPos] = temp;
        curPos = parentPos;
        parentPos = (curPos - 1) / 2;
    }
    pos++;
}
int pop () {
    if (pos == 0) return 0;
    int result = heap[0];
    pos--; // Push 하면 다음 값을 위해 1이 올라있는 상태다.
    heap[0] = heap[pos];

    int parentPos = 0;
    while (true) {
        int leftPos = parentPos * 2 + 1;
        int rightPos = leftPos + 1;
        if (leftPos >= pos) break; // 왼쪽의 Node 가 뺀 노드였다면
        int temp = heap[parentPos];
        if ((rightPos >= pos || abs(heap[leftPos]) < abs(heap[parentPos]) || (abs(heap[leftPos]) == abs(heap[parentPos]) && heap[leftPos] <= heap[parentPos])) && (abs(heap[rightPos]) > abs(heap[leftPos]) || (abs(heap[rightPos]) == abs(heap[leftPos]) && heap[leftPos] < heap[rightPos]))) {
            heap[parentPos] = heap[leftPos];
            heap[leftPos] = temp;
            parentPos = leftPos;
        } else if ((abs(heap[rightPos]) == abs(heap[parentPos]) && heap[rightPos] <= heap[parentPos]) || abs(heap[rightPos]) < abs(heap[parentPos])) {
            heap[parentPos] = heap[rightPos];
            heap[rightPos] = temp;
            parentPos = rightPos;
        } else {
            break;
        }
    }
    return result;
}
int main () {
    int capacity;
    scanf("%d", &capacity);
    while (capacity--) {
        int number;
        scanf("%d", &number);
        if (number) push(number);
        else printf("%d\n", pop());
    }
}