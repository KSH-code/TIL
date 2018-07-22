import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2460
 * BOJ 백준온라인져지 2460 지능형 기차 2 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int tempResult = 0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            tempResult += -Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            result = Math.max(result, tempResult);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
