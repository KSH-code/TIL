import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/13163
 * BOJ 백준온라인져지 13163 닉네임에 갓 붙이기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            bw.write("god");
            while (st.hasMoreTokens()) bw.write(st.nextToken());
            bw.write("\n");
        }
        bw.flush();
    }
}