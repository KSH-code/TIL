import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11050
 * BOJ 백준온라인져지 11050 이항 계수 1 풀이
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);

        int result = 1;

        // N! / (K! * (N - K)!)
        for (int i = K + 1; i <= N; i++) result = (result * i) % 10007;
        for (int i = 2; i <= N - K; i++) result = result / i;
        
        bw.write(String.valueOf(result));

        bw.flush();
    }
}