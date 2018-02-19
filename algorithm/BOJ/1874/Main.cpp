#include <cstdio>
#include <stack>
#include <vector>
/**
 * https://www.acmicpc.net/problem/1874
 * BOJ 백준온라인져지 1874 스택 수열 풀이
 */
using namespace std;
int main(){
    stack <int> stack;
    vector <char> vector; // 문자열 하기 위한 벡터
    int N,temp=0; // temp는 c배열에 있는 값을 조회할때 사용한다.
    int c[100000],idx=0; // c 배열에는 입력값을 차례대로 넣는다.
    scanf("%d",&N);
    while(N--) scanf("%d",&c[idx++]); // c배열에 넣는다.
    for(int i = 0; i<idx; i++){
        stack.push(i+1); // stack에 차례대로 1 2 3 4 넣는다.
        vector.push_back('+'); // push는 +를 출력한다.
        while(stack.size() && stack.top() == c[temp]) // stack top 값에 c[temp]가 있으면
            stack.pop(), temp++, vector.push_back('-'); // 꺼내고 temp++ -출력
    }
    if(stack.size()) printf("NO"); // 스택에서 못 꺼낸값이 있으면 NO 출력
    else{ // 아니면 vector에 들어있는 값을 차례대로 출력한다.
        for(int i = 0, size = vector.size(); i<size; i++)
            printf("%c\n",vector[i]);
    }
    return 0;
}
// class Node{
//     public:
//         int number;
//         Node(int n);
//         Node next;
// };
// Node::Node(int n){
//     number = n;
// }
// class Stack{
//     public:
//         Node head;
//         void push(int n);
//         int pop();
//         int size();
//     private:
//         int size = 0;
// };
// void Stack::push(int n){
//     Node node = new Node(n);
//     if(head != NULL){
//         node.next = head;
//     }
//     head = node;
//     size++;
// }
// int Stack::pop(){
//     if(head == NULL) return -1;
//     int number = head.number;
//     head = head.next;
//     size--;
//     return number;
// }
// int Stack::size(){
//     return size;
// }