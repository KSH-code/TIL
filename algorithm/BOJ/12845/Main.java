import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/12845
 * BOJ 백준온라인져지 12845 모두의 마블 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < N; i++) {
            int level = Integer.parseInt(str1[i]);
            if (max < level) {
                max = level;
                maxIndex = i;
            }
        }
        int result = 0;
        for (int i = 0; i < maxIndex; i++) {
            result += Integer.parseInt(str1[i]) + max;
        }
        for (int i = N - 1; i > maxIndex; i--) {
            result += Integer.parseInt(str1[i]) + max;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}