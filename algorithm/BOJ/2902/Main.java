import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2902
 * BOJ 백준온라인져지 2902 KMP는 왜 KMP일까? 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        while (st.hasMoreTokens()) {
            bw.write(st.nextToken().charAt(0));
        }
        bw.flush();
    }
}
