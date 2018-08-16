import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5597
 * BOJ 백준온라인져지 5597 과제 안 내신 분..? 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        for (int i = 0; i < 30; i++) {
            a |= 1 << i;
        }
        for (int i = 0; i < 28; i++) {
            a -= 1 << Integer.parseInt(br.readLine()) - 1;
        }
        for (int i = 0; i < 30; i++) {
            if ((a & 1 << i) > 0) {
                bw.write(String.valueOf(i + 1));
                bw.write("\n");
            }
        }
        bw.flush();
    }
}
