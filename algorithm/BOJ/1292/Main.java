import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1292
 * BOJ 백준온라인져지 1292 쉽게 푸는 문제 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int i = 0;
        int sum = 0;
        while (e > 0) {
            i++;
            for (int j = 0; j < i; j++) {
                s--;
                e--;
                if (s <= 0) sum += i;
                if (e == 0) break;
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
