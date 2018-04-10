import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/8595
 * BOJ 백준온라인져지 8595 히든 넘버 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String temp = "";
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') temp += str.charAt(i);
            else {
                if (temp.length() > 0) {
                    sum += Long.parseLong(temp);
                    temp = "";
                }
            }
        }
        if (temp.length() > 0) {
            sum += Long.parseLong(temp);
            temp = "";
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}