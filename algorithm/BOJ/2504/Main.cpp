#include <cstdio>
#include <stack>
#include <vector>
#include <string>
#include <string.h>
/**
 * https://www.acmicpc.net/problem/2504
 * BOJ 백준온라인져지 2504 괄호의 값 풀이
 */
using namespace std;
int main(){
    stack<char> characterList;
    int integerList[31] = {1}; // index 0 은 1
    char temp, compared, pre = '.';
    // temp 는 string 에서 하나씩 뽑아서 쓴다.
    // compared 는 ( or [ 가 들어가는데, 스택에서 빼서 쓴다.
    // pre 는 이전 괄호를 체크한다. 곱셈의 결합법칙에 의해 (()()) 일때 둘러싼 괄호는 0으로 처리해준다.
    char* string = new char[31]; // 입력 받을 string
    scanf("%s", string);
    int idx = 0, i = 0, length = strlen(string), tempInteger, result = 0;
    // idx 는 integerList에 접근하기 위한 변수다. 괄호의 value 를 가져온다.
    // i 는 string 에 저장된 문자를 뽑아쓰기 위한 변수
    // length 는 string의 실제 길이
    // tempInteger 는 integerList[idx] 를 빼서 저장한다.
    // result 는 tempInteger들의 값을 더해서 답을 출력해주기 위한 변수다.
    while(i != length){ // 마지막 문자가 아니라면 반복함
        temp = string[i++]; // 하나씩 뽑는다
        if(temp == '(' || temp == '['){ // 여는 괄호라면
            idx++;
            if(temp == '(')
                integerList[idx] = 2 * integerList[idx-1];
            if(temp == '[')
                integerList[idx] = 3 * integerList[idx-1];
            characterList.push(temp);
        }else{ // 여는 괄호가 아니라면
            if(characterList.empty()){ // 올바른 괄호가 아닐경우
                result = 0;
                break;
            }
            compared = characterList.top(), characterList.pop(); // 스택에 저장된것을 뽑는다.
            tempInteger = integerList[idx--];
            if(pre == ']' || pre == ')'){
                tempInteger = 0;
            }
            if(compared == '(' && temp == ')'){
                result += tempInteger;
            }else if(compared == '[' && temp == ']'){
                result += tempInteger;
            }else{ // 올바른 괄호가 아닐경우
                result = 0;
                break;
            }
        }
        pre = temp;
    }
    // 올바른 괄호가 아닐경우
    if(characterList.size()) result = 0;
    
    printf("%d", result);
    return 0;
}