import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1476
 * BOJ 백준온라인져지 1476 날짜 계산 풀이
 */
public class Main {
    private static int cycle[] = { 15, 28, 19 };
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int date[] = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
        int temp[] = { 0, 0, 0 };
        for (int i = 1; i <= 15 * 28 * 19; i++) {
            boolean t = true;
            for (int j = 0; j < 3; j++) {
                temp[j] = Math.max((temp[j] + 1) % (cycle[j] + 1), 1);
                if (date[j] != temp[j]) t = false;
            }
            if (t) {
                bw.write(String.valueOf(i));
                break;
            }
        }
        bw.flush();
    }
}