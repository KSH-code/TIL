import java.util.*;
import java.io.*;

/**
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV134DPqAA8CFAYh
 * 1206. [S/W 문제해결 기본] 1일차 - View
 */
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = 10;
        while (testcase-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int result = 0;
            for (int i = 2; i < N - 2; i++) {
                int m = 0;
                for (int j = i - 2; j < i; j++) {
                    m = Math.max(m, arr[j]);
                }
                for (int j = i + 1; j < i + 3; j++) {
                    m = Math.max(m, arr[j]);
                }
                if (arr[i] - m > 0) result += arr[i] - m;
            }
            bw.write("#" + (10 - testcase) + " " + result + "\n");
        }
        bw.flush();
    }
}