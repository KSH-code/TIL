import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15565
 * BOJ 백준온라인져지 15565 귀여운 라이언 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int map[][] = new int[11][11];
        for (int i = 1; i <= 10; i++) {
            String str1[] = br.readLine().split(" ");
            for (int j = 0; j < 10; j++) {
                map[i][j + 1] = Integer.parseInt(str1[j]);
            }
        }
        bw.flush();
    }
}