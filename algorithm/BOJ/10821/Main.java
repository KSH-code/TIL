import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10821
 * BOJ 백준온라인져지 10821 정수의 개수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int s = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',') s++;
        }
        System.out.println(s);
        bw.flush();
    }
}
