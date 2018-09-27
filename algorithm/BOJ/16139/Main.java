import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/16139
 * BOJ 백준온라인져지 16139 인간-컴퓨터 상호작용 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int prefix[][] = new int[str.length() + 1][26];
        for (int i = 1; i < prefix.length; i++) {
            char temp = str.charAt(i - 1);
            for (int j = 0; j < 26; j++) {
                if (temp == j + 'a') prefix[i][j]++;
                prefix[i][j] += prefix[i - 1][j];
            }
        }
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char alphabet = st.nextToken().charAt(0);
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken()) + 1;
            bw.write(String.valueOf(prefix[e][alphabet - 'a'] - prefix[s][alphabet - 'a']));
            bw.write("\n");
        }
        bw.flush();
    }
}