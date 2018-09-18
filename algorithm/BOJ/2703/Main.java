import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2703
 * BOJ 백준온라인져지 2703 Cryptoquote 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char temps[] = br.readLine().toCharArray();
            for (int j = 0; j < str.length(); j++) {
                char temp = str.charAt(j);
                if (temp <= 'Z' && temp >= 'A') bw.write(temps[temp - 'A']);
                else bw.write(temp);
            }
            bw.write("\n");
        }
        bw.flush();
    }
}