import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1010
 * BOJ 백준온라인져지 1010 다리 놓기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int z = 0; z < N; z++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int result = 1;
            for (int i = 1; i <= k; i++) {
                result = result * (n - i + 1) / i;
            }
            bw.write(result + "\n");
        }
        bw.flush();
    }
}