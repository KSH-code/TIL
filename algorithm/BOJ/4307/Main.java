import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/4307
 * BOJ 백준온라인져지 4307 개미 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int min = 0;
            int max = 0;
            for (int i = 0; i < N; i++) {
                int temp = Integer.parseInt(br.readLine());
                max = Math.max(max, L - temp);
                min = Math.max(min, Math.min(temp, L - temp));
            }
            bw.write(min + " " + max + "\n");
        }
        bw.flush();
    }
}