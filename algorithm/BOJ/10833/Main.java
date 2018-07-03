import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10833
 * BOJ 백준온라인져지 10833 사과 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int stus = Integer.parseInt(st.nextToken());
            int apples = Integer.parseInt(st.nextToken());
            result += apples % stus;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
