import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10709
 * BOJ 백준온라인져지 10709 기상캐스터 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        for (int i = 0; i < N; i++) {
            String str2[] = br.readLine().split("");
            int min = -1;
            for (int j = 0; j < M; j++) {
                if (str2[j].equals("c")) {
                    min = 0;
                } else if (min > -1) min++;
                bw.write(min + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}