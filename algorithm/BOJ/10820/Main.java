import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10820
 * BOJ 백준온라인져지 10820 문자열 분석 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            for (int i = 0; i < str.length(); i++) {
                char t = str.charAt(i);
                if (t <= 'Z' && t >= 'A') b++;
                else if (t <= 'z' && t >= 'a') a++;
                else if (t <= '9' && t >= '0') c++;
                else d++;
            }
            bw.write(a + " " + b + " " + c + " " + d + "\n");
        }
        bw.flush();
    }
}