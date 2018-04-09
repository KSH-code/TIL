import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5354
 * BOJ 백준온라인져지 5354 j박스 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            for (int z = 0; z < M; z++) {
                for (int j = 0; j < M; j++) {
                    if (j + 1 < M && j != 0 && z != 0 && z + 1 < M) bw.write("J");
                    else bw.write("#");
                }
                bw.write("\n");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}