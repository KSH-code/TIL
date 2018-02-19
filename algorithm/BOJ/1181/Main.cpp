#include <cstdio>
#include <vector>
#include <stdlib.h>
#include <string>
#include <string.h>
#include <algorithm>
/**
 * https://www.acmicpc.net/problem/1181
 * BOJ 백준온라인져지 1181 단어 정렬 풀이
 */
using namespace std;
bool cmp(string a, string b){
    if(a.length() < b.length()) return true;
    else if(a.length() == b.length()) return a.compare(b) < 0;
    return false;
}
int main(){
    int N;
    vector<string> v = vector<string>();
    scanf("%d",&N);
    while(N--){
        char *temp = (char*)malloc(60);
        scanf("%s",temp);
        string t = string(temp);
        if(find(v.begin(), v.end(), t) == v.end()){
            v.push_back(t);
        }
        free(temp);
    }
    sort(v.begin(), v.end(), cmp);
    for(int i = 0,size=v.size(); i<size; i++)
        printf("%s\n",v[i].c_str());
    return 0;
}