import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1322
 * BOJ 백준온라인져지 1322 X와 K 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long Y = 0;
        for (int i = 0, j = 0; K > 0; i++, j++) {
            while (((1L << i) & X) > 0) i++;
            if (((1 << j) & K) > 0) {
                Y += 1L << i;
                K -= 1 << j;
            }
        }
        bw.write(String.valueOf(Y));
        bw.flush();
    }
}