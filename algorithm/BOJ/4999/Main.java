import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/4999
 * BOJ 백준온라인져지 4999 아! 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw.write(br.readLine().length() >= br.readLine().length() ? "go" : "no");
        bw.flush();
    }
}
