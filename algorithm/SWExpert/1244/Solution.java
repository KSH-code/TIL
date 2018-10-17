import java.util.*;
import java.io.*;

/**
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15Khn6AN0CFAYD&categoryId=AV15Khn6AN0CFAYD&categoryType=CODE
 * 1244. [S/W 문제해결 응용] 2일차 - 최대 상금
 */
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int result = 0, N;
    private static char str[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int t = testcase;
        while (testcase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String tempString = st.nextToken();
            N = Integer.parseInt(st.nextToken());
            result = 0;
            str = tempString.toCharArray();
            bruteforce(0, 0);
            bw.write("#" + (t - testcase) + " " + result + "\n");
        }
        bw.flush();
    }
    private static void bruteforce (int x, int cnt) {
        if (cnt == N) {
            result = Math.max(result, Integer.parseInt(String.valueOf(str)));
            return;
        }
        for (int i = x; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                bruteforce(i, cnt + 1);
                str[j] = str[i];
                str[i] = temp;
            }
        }
    }
}