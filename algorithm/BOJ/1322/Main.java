import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1322
 * BOJ 백준온라인져지 1322 X와 K 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i <= 31; i++) {
            if ((X & (1 << i)) == 0) {
                temp.add(i);
            }
        }
        long result = 0;
        int t = 0;
        for (int i = 0; i <= 31; i++) {
            if ((i + 1 % K) == 1) result += 1 << temp.get(t++);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}