import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1032
 * BOJ 백준온라인져지 1032 명령 프롬프트 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str1[] = new String[N];
        for (int i = 0; i < N; i++) str1[i] = br.readLine();
        for (int i = 0; i < str1[0].length(); i++) {
            int isNotEqual = 0;
            for (int j = 1; j < N; j++) isNotEqual |= str1[0].charAt(i) - str1[j].charAt(i);
            if (isNotEqual != 0) bw.write("?");
            else bw.write(str1[0].charAt(i));
        }
        bw.flush();
    }
}
