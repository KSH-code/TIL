import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2965
 * BOJ 백준온라인져지 2965 캥거루 세마리 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str1[] = br.readLine().split(" ");
        int arr[] = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(str1[i]);
        }

        int result = b - a > c - b ? b - a : c - b;

        bw.write(String.valueOf(result - 1));
        bw.flush();
    }
}