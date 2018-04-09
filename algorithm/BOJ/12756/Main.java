import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/12756
 * BOJ 백준온라인져지 12756 고급 레스토랑 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        String str2[] = br.readLine().split(" ");
        int A1 = Integer.parseInt(str1[0]);
        int A2 = Integer.parseInt(str1[1]);
        int B1 = Integer.parseInt(str2[0]);
        int B2 = Integer.parseInt(str2[1]);
        while (A2 > 0 && B2 > 0) {
            A2 -= B1;
            B2 -= A1;
        }
        if (A2 <= 0 && B2 <= 0) bw.write("DRAW");
        else if (A2 > B2) bw.write("PLAYER A");
        else bw.write("PLAYER B");
        bw.flush();
    }
}