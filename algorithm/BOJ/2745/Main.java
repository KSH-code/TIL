import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2745
 * BOJ 백준온라인져지 2745 진법 변환 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int f = (int) Math.pow(B, i);
            char temp = str.charAt(str.length() - i - 1);
            if (temp >= '0' && temp <= '9') result += f * (temp - '0');
            else result += f * (temp - 'A' + 10);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}