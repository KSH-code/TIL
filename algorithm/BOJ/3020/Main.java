import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/3020
 * BOJ 백준온라인져지 3020 개똥벌레 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int H = Integer.parseInt(str1[1]);
        int bottom[] = new int[H];
        int top[] = new int[H];
        for (int i = 0; i < N / 2; i++) {
            bottom[Integer.parseInt(br.readLine()) - 1]++;
            top[Integer.parseInt(br.readLine()) - 1]++;
        }
        int totalBottom[] = new int[H];
        int totalTop[] = new int[H];
        totalBottom[H - 1] = bottom[H - 1];
        totalTop[0] = top[H - 1];
        for (int i = H - 2; i >= 0; i--) {
            totalBottom[i] = totalBottom[i + 1] + bottom[i];
        }
        for (int i = 1; i < H; i++) {
            totalTop[i] = totalTop[i - 1] + top[H - i - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < H; i++) {
            if (min > totalBottom[i] + totalTop[i]) {
                min = totalBottom[i] + totalTop[i];
            }
        }
        int result = 0;
        for (int i = 0; i < H; i++) {
            if (min == totalBottom[i] + totalTop[i]) result++;
        }
        bw.write(min + " " + result);
        bw.flush();
    }
}