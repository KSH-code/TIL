import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15963
 * BOJ 백준온라인져지 15963 CASIO 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        bw.write(st.nextToken().equals(st.nextToken()) ? '1' : '0');
        bw.flush();
    }
}