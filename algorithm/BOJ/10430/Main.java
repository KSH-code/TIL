import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10430
 * BOJ 백준온라인져지 10430 나머지 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf((A+B) % C));
        bw.write("\n");
        bw.write(String.valueOf((A+B) % C));
        bw.write("\n");
        bw.write(String.valueOf((A*B) % C));
        bw.write("\n");
        bw.write(String.valueOf((A*B) % C));
        bw.flush();
    }
}
