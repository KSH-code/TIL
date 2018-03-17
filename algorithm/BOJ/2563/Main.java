import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2563
 * BOJ 백준온라인져지 2563 색종이 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        boolean black[][] = new boolean[101][101];

        for (int z = 0; z < N; z++) {
            String str1[] = br.readLine().split(" ");
            int x = Integer.parseInt(str1[0]);
            int y = Integer.parseInt(str1[1]);
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    black[i][j] = true;
                }
            }
        }
        int area = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (black[i][j]) area++;
            }
        }
        bw.write(String.valueOf(area));
        bw.flush();
    }
}