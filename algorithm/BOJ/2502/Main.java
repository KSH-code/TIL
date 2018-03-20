import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2502
 * BOJ 백준온라인져지 2502 떡 먹는 호랑이 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split( " ");
        int D = Integer.parseInt(str1[0]); 
        int K = Integer.parseInt(str1[1]);
        int fibo[][] = new int[31][2];
        fibo[1][0] = 1;
        fibo[2][1] = 1;
        for (int i = 3; i <= D; i++) {
            for (int j = 0; j < 2; j++) fibo[i][j] = fibo[i - 2][j] + fibo[i - 1][j];
        }
        for (int i = 1; i <= K; i++) {
            if ((K - fibo[D][0] * i) % fibo[D][1] == 0) {
                bw.write(i + "\n");
                bw.write(String.valueOf((K - fibo[D][0] * i) / fibo[D][1]));
                break;
            }
        }
        bw.flush();
    }
}