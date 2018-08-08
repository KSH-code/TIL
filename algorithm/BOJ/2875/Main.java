import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2875
 * BOJ 백준온라인져지 2875 대회 or 인턴 풀이
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int t = N / 2;
        while (K > 0) {
            if (N / 2 < M) {
                M--;
                K--;
            } else {
                N -= 2;
                K -= 2;
            }
        }
        bw.write(String.valueOf(Math.min(N / 2, M)));
        bw.flush();
    }
}