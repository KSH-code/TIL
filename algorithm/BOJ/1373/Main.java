import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1373
 * BOJ 백준온라인져지 1373 2진수 8진수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while (str.length() % 3 > 0) str = "0" + str;
        for (int i = 0; i < str.length(); i += 3) {
            bw.write(String.valueOf((str.charAt(i) - '0') * 4 + (str.charAt(i + 1) - '0') * 2 + (str.charAt(i + 2) - '0') * 1));
        }
        bw.flush();
    }
}
