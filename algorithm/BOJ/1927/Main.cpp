#include <cstdio>
/**
 * https://www.acmicpc.net/problem/1927
 * BOJ 백준온라인져지 1927 최소 힙 풀이
 */
using namespace std;
class Heap {
    public:
        Heap (int capacity);
        void push (int data);
        int pop ();
    private:
        int *heap;
        int capacity;
        int pos;
};
Heap::Heap (int capacity) : capacity(capacity) {
    heap = new int[capacity];
    pos = 0;
}
int Heap::pop () {
    if (pos == 0) return 0;
    int data = heap[0];
    pos--;
    heap[0] = heap[pos];
    int parentPos = 0;
    while (true) {
        int leftPos = parentPos * 2 + 1;
        int rightPos = leftPos + 1;
        if (leftPos >= pos) break; // 마지막에는 맨 위에 있던것이 들어간다.
        int temp = heap[parentPos]; // swap 하기 위함
        if ((rightPos >= pos || heap[leftPos] <= heap[rightPos]) && heap[leftPos] < heap[parentPos]) {
            heap[parentPos] = heap[leftPos];
            heap[leftPos] = temp;
            parentPos = leftPos;
        } else if(heap[leftPos] > heap[rightPos] && heap[rightPos] < heap[parentPos]) {
            heap[parentPos] = heap[rightPos];
            heap[rightPos] = temp;
            parentPos = rightPos;
        } else {
            break;
        }
    }
    return data;
}
void Heap::push (int number) {
    if (pos == capacity) return;

    int curPos = pos;
    int parentPos = (curPos - 1) / 2;
    heap[pos] = number;

    while (curPos > 0 && heap[curPos] < heap[parentPos]) {
        int temp = heap[curPos];
        heap[curPos] = heap[parentPos];
        heap[parentPos] = temp;
        curPos = parentPos;
        parentPos = (curPos - 1) / 2;
    }
    pos++;
}
int main () {
    int capacity;
    scanf("%d", &capacity);
    Heap heap(capacity);
    while (capacity--) {
        int number;
        scanf("%d", &number);
        if (number == 0) printf("%d\n", heap.pop());
        else heap.push(number);
    }
}