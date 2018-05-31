import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2864
 * BOJ 백준온라인져지 2864 5와 6의 차이 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken().replaceAll("5", "6");
        String B = st.nextToken().replaceAll("5", "6");
        bw.write((Integer.parseInt(A.replaceAll("6", "5")) + Integer.parseInt(B.replaceAll("6", "5"))) + " " + (Integer.parseInt(A) + Integer.parseInt(B)));
        bw.flush();
    }
}