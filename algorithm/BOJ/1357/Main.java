import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1357
 * BOJ 백준온라인져지 1357 뒤집힌 덧셈 풀이
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int X1 = rev(X);
        int X2 = rev(Y);
        bw.write(String.valueOf(rev(X1 + X2)));
        bw.flush();
    }
    private static int rev (int x) {
        int t = 0;
        while (x > 0) {
            t *= 10;
            t += x % 10;
            x /= 10;
        }
        return t;
    }
}