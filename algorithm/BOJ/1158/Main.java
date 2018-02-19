import java.util.*;
import java.io.*;
/**
 * https://www.acmicpc.net/problem/1158
 * BOJ 백준온라인져지 1158 조세퍼스 문제 풀이
 */
class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");

        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);

        int array[] = new int[N+1];

        for(int i = 1; i<=N; i++){
            array[i] = i;
        }

        bw.write("<");
        int result = 0, idx = 0;
        for(int i = 1, cnt = 0; i<N; i++){
            cnt = 0;
            while(cnt != M){ // M만큼 다음의 숫자
                idx++;
                if(idx == N+1) idx = 1; // 배열의 최대 index를 넘어가면 1로 변경해준다.
                if(array[idx] > 0) cnt++; // 배열의 요소가 제외된 것이 아니라면 cnt를 1 올려준다.
            }
            bw.write(array[idx] + ", ");
            array[idx] = 0;
        }

        while(array[idx] == 0){
            idx++;
            if(idx == N+1) idx = 1;
        }

        bw.write(array[idx] + ">");

        bw.flush();
    }
}