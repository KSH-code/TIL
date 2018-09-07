import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1946
 * BOJ 백준온라인져지 1946 신입 사원 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int grades[] = new int[N + 1];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int grade = Integer.parseInt(st.nextToken());
                int rank = Integer.parseInt(st.nextToken());
                grades[rank] = grade;
            }
            int result = 1;
            int min = grades[1];
            for (int i = 2; i <= N; i++) {
                if (min > grades[i]) {
                    min = grades[i];
                    result++;
                }
            }
            bw.write(String.valueOf(result));
            bw.write("\n");
        }
        bw.flush();
    }
}