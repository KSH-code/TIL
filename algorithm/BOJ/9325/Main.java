import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9325
 * BOJ 백준온라인져지 9325 얼마? 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                n += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }
            bw.write(String.valueOf(n));
            bw.write("\n");
        }
        bw.flush();
    }
}
