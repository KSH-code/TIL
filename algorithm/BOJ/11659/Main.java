import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11659
 * BOJ 백준온라인져지 11659 구간 합 구하기 4 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write(String.valueOf(-arr[Integer.parseInt(st.nextToken()) - 1] + arr[Integer.parseInt(st.nextToken())]));
            bw.write("\n");
        }
        bw.flush();
    }
}
