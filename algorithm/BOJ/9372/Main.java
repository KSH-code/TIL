import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9372
 * BOJ 백준온라인져지 9372 상근이의 여행 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            for (int i = 0; i < M; i++) br.readLine();
            bw.write(String.valueOf(N - 1));
            bw.write("\n");
        }
        bw.flush();
    }
}