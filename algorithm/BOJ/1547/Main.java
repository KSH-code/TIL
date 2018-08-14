import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1547
 * BOJ 백준온라인져지 1547 공 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int ball = 1;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            if (s == ball) ball = e;
            else if (e == ball) ball = s;
        }
        bw.write(String.valueOf(ball));
        bw.flush();
    }
}