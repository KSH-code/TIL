import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2506
 * BOJ 백준온라인져지 2506 점수계산 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int combo = 0;
        int result = 0;
        for (int i = 0; i < N; i++) {
            combo++;
            if (str.charAt(i * 2) == '1') result += combo;
            else combo = 0;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
