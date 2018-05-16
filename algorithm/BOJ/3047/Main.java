import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/3047
 * BOJ 백준온라인져지 3047 ABC 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int memoization[] = new int[16];
    private static int arr[][];
    private static int N;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(str1[i]);
        Arrays.sort(arr);
        String str2[] = br.readLine().split("");
        for (int i = 0; i < 3; i++) bw.write(arr[str2[i].charAt(0) - 'A'] + " ");
        bw.flush();
    }
}