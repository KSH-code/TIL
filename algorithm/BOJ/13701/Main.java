import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/13701
 * BOJ 백준온라인져지 13701 중복 제거 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BitSet b = new BitSet();
        while (st.hasMoreTokens()) {
            int m = Integer.parseInt(st.nextToken());
            if (b.get(m)) continue;
            b.set(m);
            bw.write(m + " ");
        }
        bw.flush();
    }
}