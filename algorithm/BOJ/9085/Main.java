import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9085
 * BOJ 백준온라인져지 9085 더하기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;
            for (int j = 0; j < N; j++) {
                result += Integer.parseInt(st.nextToken());
            }
            bw.write(String.valueOf(result));
            bw.write("\n");
        }
        bw.flush();
    }
}
