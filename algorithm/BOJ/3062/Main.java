import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/3062
 * BOJ 백준온라인져지 3062 피보나치 함수 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int j = 0; j < N; j++) {
            String str = br.readLine();
            int number = Integer.parseInt(new StringBuilder(str).reverse().toString()) + Integer.parseInt(str);
            str = String.valueOf(number);
            boolean No = false;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    No = true;
                    break;
                }
            }
            if (No) bw.write("NO");
            else bw.write("YES");
            bw.write("\n");
        }
        bw.flush();
    }
}