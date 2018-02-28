import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/contest/problem/15552
 * BOJ 백준온라인져지 15552 빠른 A+B 풀이
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            String str1[] = br.readLine().split(" ");
            int A = Integer.parseInt(str1[0]);
            int B = Integer.parseInt(str1[1]);
            bw.write((A + B) + "\n");
            if (testcase % 1000 == 0) bw.flush();
        }
        bw.flush();
    }
}