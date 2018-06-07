import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2743
 * BOJ 백준온라인져지 2743 단어 길이 재기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw.write(String.valueOf(br.readLine().length()));
        bw.flush();
    }
}