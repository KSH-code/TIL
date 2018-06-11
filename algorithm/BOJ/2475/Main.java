import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2475
 * BOJ 백준온라인져지 2475 검증수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Math.pow(Integer.parseInt(st.nextToken()), 2);
        }
        bw.write(String.valueOf(sum % 10));
        bw.flush();
    }
}
