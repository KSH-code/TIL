import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5355
 * BOJ 백준온라인져지 5355 화성 수학 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double n = Double.parseDouble(st.nextToken());
            while (st.hasMoreTokens()) {
                switch (st.nextToken().charAt(0)) {
                    case '@':
                        n *= 3;
                        break;
                    case '%':
                        n += 5;
                        break;
                    case '#':
                        n -= 7;
                        break;
                }
            }
            n = Math.floor(n * 100);
            System.out.format("%.2f\n", n / 100);
        }
        bw.flush();
    }
}