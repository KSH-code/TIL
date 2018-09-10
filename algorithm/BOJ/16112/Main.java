import java.util.*;
import java.io.*;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/16112
 * BOJ 백준온라인져지 16112 5차 전직 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long cnt = 0;
        BigInteger b = BigInteger.ZERO;
        for (int i = 1; i < N; i++) {
            cnt = Math.min(cnt + 1, K);
            b = b.add(BigInteger.valueOf(arr[i] * cnt));
        }
        bw.write(b.toString());
        bw.flush();
    }
}