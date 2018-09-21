import java.util.*;
import java.io.*;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/15953
 * BOJ 백준온라인져지 15953 상금 헌터 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int p[][] = {{ 5000000, 3000000, 2000000, 500000, 300000, 100000 }, { 5120000, 2560000, 1280000, 640000, 320000 }};
        int h[][] = {{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 4, 8, 16 }};
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;
            for (int k = 0; k < 2; k++) {
                int a = Integer.parseInt(st.nextToken());
                if (a == 0) continue;
                for (int j = 0; j < h[k].length; j++) {
                    if (a <= h[k][j]) {
                        result += p[k][j];
                        break;
                    }
                    a -= h[k][j];
                }
            }
            bw.write(String.valueOf(result));
            bw.write("\n");
        }
        bw.flush();
    }
}