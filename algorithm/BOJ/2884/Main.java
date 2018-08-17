import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2884
 * BOJ 백준온라인져지 2884 알람 시계 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        b -= 45;
        if (b < 0) {
            b += 60;
            a--;
            if (a < 0) {
                a += 24;
            }
        }
        System.out.println(a + " " + b);
        bw.flush();
    }
}
