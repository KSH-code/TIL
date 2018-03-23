import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10158
 * BOJ 백준온라인져지 10158 개미 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");
        String str2[] = br.readLine().split(" ");
        int w = Integer.parseInt(str1[0]);
        int h = Integer.parseInt(str1[1]);
        int x = Integer.parseInt(str2[0]);
        int y = Integer.parseInt(str2[1]);
        int N = Integer.parseInt(br.readLine());
        boolean maxW = (x + N) / w % 2 == 1;
        boolean maxH = (y + N) / h % 2 == 1;
        int resultX = 0;
        int resultY = 0;
        if (maxW) {
            resultX = w - (x + N) % w;
        } else {
            resultX = (x + N) % w;
        }
        if (maxH) {
            resultY = h - (y + N) % h;
        } else {
            resultY = (y + N) % h;
        }
        bw.write(resultX + " " + resultY);
        bw.flush();
    }
}