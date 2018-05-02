import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2331
 * BOJ 백준온라인져지 2331 반복수열 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int A = Integer.parseInt(str1[0]);
        int P = Integer.parseInt(str1[1]);
        boolean visited[] = new boolean[295246];
        int check[] = new int[295246];
        int cnt = 0;
        while (true) {
            if (visited[A]) break;
            check[cnt] = A;
            cnt++;
            visited[A] = true;
            int sum = 0;
            for (; A > 0; sum += Math.pow(A % 10, P), A /= 10);
            A = sum;
        }
        for (int i = 0; i < 295246; i++) {
            if (check[i] == A) bw.write(String.valueOf(i));
        }
        bw.flush();
    }
}