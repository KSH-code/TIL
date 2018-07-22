import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1057
 * BOJ 백준온라인져지 1057 토너먼트 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        for (int i = 1;; i++) {
            A = A / 2 + (A & 1);
            B = B / 2 + (B & 1);
            if (A == B) {
                bw.write(String.valueOf(i));
                break;
            }
        }
        bw.flush();
    }
}
