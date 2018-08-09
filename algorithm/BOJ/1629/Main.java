import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1629
 * BOJ 백준온라인져지 1629 곱셈 풀이
 */
public class Main {
    private static long A, B, C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());
        bw.write(String.valueOf(pow(A, B)));
        bw.flush();
    }
    private static long pow (long A, long B) {
        if (B == 0) return 1;
        long t = pow(A, B / 2);
        long result = t * t % C;
        if (B % 2 == 1) result = result * A % C;
        return result;
    }
}