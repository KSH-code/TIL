import java.io.*;
import java.util.*;
/**
 * https://www.acmicpc.net/problem/2156
 * BOJ 백준온라인져지 2156 포도주 시식 풀이
 */
class Main{
        private static int mResult = 0;
        private static int n;
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        int arr[] = new int[n+1];
        int result[] = new int[n+1];
        for(int i = 1;i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 1, length = n >= 2 ? n : 1; i<=length; i++){
            result[i] += arr[i-1] + arr[i];
        }
        for(int i = 3; i<=n; i++){
            result[i] = Math.max(Math.max(result[i-3] + arr[i-1] + arr[i], result[i-2] + arr[i]), result[i-1]);
        }
        bw.write(String.valueOf(result[n]));
        bw.flush();
    }
}