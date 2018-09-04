import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2028
 * BOJ 백준온라인져지 2028 자기복제수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int t = Integer.parseInt(str);
            bw.write(t * t % Math.pow(10, str.length()) == t ? "YES" : "NO");
            bw.write("\n");
        }
        bw.flush();
    }
}