import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5671
 * BOJ 백준온라인져지 5671 호텔 방 번호 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            String str1[] = str.split(" ");
            int N = Integer.parseInt(str1[0]);
            int M = Integer.parseInt(str1[1]);
            int cnt = 0;
            for (int i = N; i <= M; i++) {
                int arr[] = new int[10];
                String temp = String.valueOf(i);
                int check = 1;
                for (int j = 0; j < temp.length(); j++) {
                    arr[temp.charAt(j) - '0']++;
                    if (arr[temp.charAt(j) - '0'] != 1) check = 0;
                }
                cnt += check;
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
    }
}