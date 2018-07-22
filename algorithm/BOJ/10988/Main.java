import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10988
 * BOJ 백준온라인져지 10988 팰린드롬인지 확인하기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println(0);
                return;
            }
        }
        bw.write("1");
        bw.flush();
    }
}
