import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10886
 * BOJ 백준온라인져지 10886 0 = not cute / 1 = cute 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < N; i++) {
            result += Integer.parseInt(br.readLine());
        }
        if (result > N / 2) bw.write("Junhee is cute!");
        else bw.write("Junhee is not cute!");
        bw.flush();
    }
}
