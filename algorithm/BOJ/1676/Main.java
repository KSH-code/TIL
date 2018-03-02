import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1676
 * BOJ 백준온라인져지 1676 팩토리얼 0의 개수 풀이
 */
public class Main {

    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        int result = n / 5 + n / 25 + n / 125;

        bw.write(String.valueOf(result));
        bw.flush();
    }
}