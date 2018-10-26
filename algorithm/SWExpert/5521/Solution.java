import java.util.*;
import java.io.*;

/**
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWWO3kT6F2oDFAV4&categoryId=AWWO3kT6F2oDFAV4&categoryType=CODE
 * 5521. 상원이의 생일파티
 */
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int z = 1; z <= testcase; z++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            boolean isChecked[] = new boolean[N + 1];
            boolean isGoodRelationship[][] = new boolean[N + 1][N + 1];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                isGoodRelationship[b][a] = isGoodRelationship[a][b] = true;
            }
            isChecked[1] = true;
            int result = 0;
            for (int i = 1; i <= N; i++) {
                if (isGoodRelationship[1][i]) {
                    if (!isChecked[i]) {
                        result++;
                        isChecked[i] = true;
                    }
                    for (int j = 1; j <= N; j++) {
                        if (isGoodRelationship[i][j]) {
                            if (!isChecked[j]) {
                                result++;
                                isChecked[j] = true;
                            }
                        }
                    }
                }
            }
            bw.write("#" + z + " " + result + "\n");
        }
        bw.flush();
    }
}