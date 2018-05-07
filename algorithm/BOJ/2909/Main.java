import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2909
 * BOJ 백준온라인져지 2909 캔디 구매 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int C = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);
        int money = (int) Math.pow(10, K);
        int result = C / money * money;
        if (C % money >= money / 2) result += money;
        bw.write(String.valueOf(result));
        bw.flush();
    }
}