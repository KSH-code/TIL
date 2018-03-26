import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/7567
 * BOJ 백준온라인져지 7567 그룻 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split("");
        String temp = "";
        int result = 0;
        for (int i = 0; i < str1.length; i++) {
            if (temp.equals(str1[i])) result += 5;
            else result += 10;
            temp = str1[i];
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}