import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15964
 * BOJ 백준온라인져지 15964 이상한 기호 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        bw.write(String.valueOf((long)(Math.pow(Integer.parseInt(st.nextToken()), 2) - Math.pow(Integer.parseInt(st.nextToken()), 2))));
        bw.flush();
    }
}