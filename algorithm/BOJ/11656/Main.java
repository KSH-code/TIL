import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11656
 * BOJ 백준온라인져지 11656 접미사 배열 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String arr[] = new String[str.length()];
        Arrays.fill(arr, "");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                arr[i] += str.charAt(j);
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < str.length(); i++) {
            bw.write(arr[i]);
            bw.write("\n");
        }
        bw.flush();
    }
}