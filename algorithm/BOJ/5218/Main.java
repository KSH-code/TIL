import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5218
 * BOJ 백준온라인져지 5218 알파벳 거리 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            bw.write("Distances:");
            for (int j = 0; j < a.length(); j++) {
                bw.write(' ');
                char tempA = a.charAt(j);
                char tempB = b.charAt(j);
                int result = 0;
                if (tempA <= tempB) result = tempB - tempA;
                else result = tempB - tempA + 26;
                bw.write(String.valueOf(result));
            }
            bw.write("\n");
        }
        bw.flush();
    }
}