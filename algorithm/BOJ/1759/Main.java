import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1759
 * BOJ 백준온라인져지 1759 암호 만들기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static String str = "";
    private static char alpha[];
    private static int L, C;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        alpha = new char[C];
        for (int i = 0; i < C; i++) alpha[i] = st.nextToken().charAt(0);
        Arrays.sort(alpha);
        dfs(0);
        bw.flush();
    }
    private static void dfs (int biggest) throws IOException {
        if (str.length() == L) {
            print();
            return;
        }
        for (int i = biggest; i < C; i++) {
            str += alpha[i];
            dfs(i + 1);
            str = str.substring(0, str.length() - 1);
        }
    }
    private static void print () throws IOException {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') result++;
        }
        if (result == 0 || str.length() - result < 2) return;
        bw.write(str);
        bw.write("\n");
    }
}
