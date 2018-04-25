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
        br.readLine();
        String str1[] = br.readLine().split(" ");
        int max = 0;
        int maxIndex = 0;
        int result = 0;
        for (int i = 0; i < str1.length; i++) {
            int level = Integer.parseInt(str1[i]);
            if (max < level) {
                max = level;
                maxIndex = i;
            }
            result += level;
        }
        result += max * (str1.length - 2);
        bw.write(String.valueOf(result));
        bw.flush();
    }
}