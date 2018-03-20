import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2501
 * BOJ 백준온라인져지 2501 약수 구하기 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                K--;
                if (K == 0) {
                    System.out.println(i);
                    return;
                }
            }
        }
        bw.write("0");
        bw.flush();
    }
}