import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/6591
 * BOJ 백준온라인져지 6591 이항 쇼다운 풀이
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str1[] = br.readLine().split(" ");
            long N = Long.parseLong(str1[0]);
            long K = Long.parseLong(str1[1]);
            if (N == 0 && K == 0) break;
            long result = 1;

            // N! / (K! * (N - K)!)
            // 5 * 4 * 3 * 2 * 1
            // 2 * 1 * 3 * 2 * 1
            if (K > N - K) K = N - K;
            for (long i = 1; i <= K; i++) {
                result *= N--;
                result /= i;
            }
            
            System.out.println(result);
        }

        bw.flush();
    }
}