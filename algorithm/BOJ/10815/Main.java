import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10815
 * BOJ 백준온라인져지 10815 숫자 카드 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        BitSet bitSet = new BitSet();
        for (int i = 0; i < N; i++) bitSet.set(Integer.parseInt(st.nextToken()) + 10000000);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) bw.write((bitSet.get(Integer.parseInt(st.nextToken()) + 10000000) ? "1 " : "0 "));
        bw.flush();
    }
}
