import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1013
 * BOJ 백준온라인져지 1013 Contact 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.matches("(100+1+|01)+")) bw.write("YES");
            else bw.write("NO");
            bw.write("\n");
        }
        bw.flush();
    }
}