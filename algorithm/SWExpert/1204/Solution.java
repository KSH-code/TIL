import java.util.*;
import java.io.*;

/**
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV13zo1KAAACFAYh&categoryId=AV13zo1KAAACFAYh&categoryType=CODE
 * 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
 */
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int zz = 0; zz < testcase; zz++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[] = new int[101];
            int maxCount = 0;
            int maxGrade = 0;
            for (int i = 0; i < 1000; i++) {
                int grade = Integer.parseInt(st.nextToken());
                arr[grade]++;
                if (arr[grade] > maxCount) {
                    maxCount = arr[grade];
                    maxGrade = grade;
                } else if (arr[grade] == maxCount) {
                    maxGrade = Math.max(maxGrade, grade);
                }
            }
            bw.write("#" + n + " " + maxGrade + "\n");
        }
        bw.flush();
    }
}