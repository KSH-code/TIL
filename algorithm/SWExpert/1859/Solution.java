import java.util.*;
import java.io.*;

/**
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LrsUaDxcDFAXc&categoryId=AV5LrsUaDxcDFAXc&categoryType=CODE
 * 1859. 백만 장자 프로젝트
 */
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int t = testcase;
        while (testcase-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[] = new int[N];
            int maxs[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int max = 0;
            for (int i = N - 1; i >= 0; i--) {
                maxs[i] = max = Math.max(max, arr[i]);
            }
            long result = 0;
            for (int i = 0; i < N; i++) {
                result += maxs[i] - arr[i];
            }
            bw.write("#" + (t - testcase) + " " + result + "\n");
        }
        bw.flush();
    }
}