import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2669
 * BOJ 백준온라인져지 2669 직사각형 네개의 합집합의 면적 구하기 풀이
 */
public class Main {
    private static boolean visited[];
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        int map[][] = new int[101][101];
        for (int i = 0; i < 4; i++) {
            String str1[] = br.readLine().split(" ");
            int lx = Integer.parseInt(str1[0]);
            int ly = Integer.parseInt(str1[1]);
            int rx = Integer.parseInt(str1[2]);
            int ry = Integer.parseInt(str1[3]);
            for (; lx < rx; lx++) {
                for (int j = ly; j < ry; j++) {
                    if (map[lx][j] == 0) {
                        result += map[lx][j] = 1;
                    }
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}