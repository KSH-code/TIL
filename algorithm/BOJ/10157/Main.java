import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10157
 * BOJ 백준온라인져지 10157 자리배정 풀이
 */
public class Main {
    private static int K, C, R;
    private static int xxxx[] = {1, 0, -1, 0};
    private static int yyyy[] = {0, 1, 0, -1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");
        C = Integer.parseInt(str1[0]);
        R = Integer.parseInt(str1[1]) + 1;
        K = Integer.parseInt(br.readLine());
        int d = -1;
        int i = 0;
        int x = 0;
        int y = 1;
        int check = 1;
        while (check > 0) {
            d = (d + 1) % 4;

            if (d % 2 == 0) R--;
            else C--;

            check = d % 2 == 0 ? R : C;
            for (int j = 0; j < check; j++) {
                i++;
                x += xxxx[d];
                y += yyyy[d];
                if (i == K) {
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
        bw.write("0");
        bw.flush();
    }
}