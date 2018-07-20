import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2420
 * BOJ 백준온라인져지 2420 사파리월드 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        bw.write(String.valueOf(Math.abs(Long.parseLong(st.nextToken()) - Long.parseLong(st.nextToken()))));
        bw.flush();
    }
}
