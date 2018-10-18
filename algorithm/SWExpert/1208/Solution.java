import java.util.*;
import java.io.*;

/**
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV139KOaABgCFAYh&categoryId=AV139KOaABgCFAYh&categoryType=CODE
 * 1208. [S/W 문제해결 기본] 1일차 - Flatten
 */
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = 10;
        for (int z = 1; z <= testcase; z++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[] = new int[st.countTokens()];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            while (N-- > 0) {
                arr[0]++;
                arr[arr.length - 1]--;
                Arrays.sort(arr);
            }
            bw.write("#" + z + " " + (arr[arr.length - 1] - arr[0]) + "\n");
        }
        bw.flush();
    }
}