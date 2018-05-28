import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/4435
 * BOJ 백준온라인져지 4435 색종이 풀이
 */
public class Main {
    private static int rate[][] = { { 1, 2, 3, 3, 4, 10 }, { 1, 2, 2, 2, 3, 5, 10 } };
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            int army[] = new int[2];
            for (int j = 0; j < 2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int k = 0;
                while (st.hasMoreTokens()) {
                    army[j] += Integer.parseInt(st.nextToken()) * rate[j][k++];
                }
            }
            bw.write("Battle " + i + ": ");
            if (army[0] > army[1]) bw.write("Good triumphs over Evil");
            else if (army[0] < army[1]) bw.write("Evil eradicates all trace of Good");
            else bw.write("No victor on this battle field");
            bw.write("\n");
        }
        bw.flush();
    }
}