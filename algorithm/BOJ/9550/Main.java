import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9550
 * BOJ 백준온라인져지 9550 아이들은 사탕을 좋아해 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            String str1[] = br.readLine().split(" ");
            int N = Integer.parseInt(str1[0]);
            int K = Integer.parseInt(str1[1]);
            String candies[] = br.readLine().split(" ");
            int count = 0;
            for (int j = 0; j < N; j++) {
                count += Integer.parseInt(candies[j]) / K;
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}