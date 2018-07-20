import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2744
 * BOJ 백준온라인져지 2744 대소문자 바꾸기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char alpha = str.charAt(i);
            if (alpha >= 'a' && alpha <= 'z') alpha = (char) (((int) alpha) - 'a' + 'A');
            else alpha = (char) (((int) alpha) + 'a' - 'A');
            bw.write(alpha);
        }
        bw.flush();
    }
}
