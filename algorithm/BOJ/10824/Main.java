import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10824
 * BOJ 백준온라인져지 10824 네 수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N, M;
    private static boolean visited[], edges[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        bw.write(String.valueOf(Long.parseLong(st.nextToken() + st.nextToken()) + Long.parseLong(st.nextToken() + st.nextToken())));
        bw.flush();
    }
}
