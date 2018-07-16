import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/4101
 * BOJ 백준온라인져지 4101 크냐? 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if ((N | M) == 0) break;
            if (N > M) bw.write("Yes");
            else bw.write("No");
            bw.write("\n");
        }
        bw.flush();
    }
}
