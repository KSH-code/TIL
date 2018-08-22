import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2851
 * BOJ 백준온라인져지 2851 슈퍼 마리오 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int t = 0;
        for (int i = 0; i < 10; i++) {
            t += Integer.parseInt(br.readLine());
            if (Math.abs(100 - result) >= Math.abs(100 - t)) result = t;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
