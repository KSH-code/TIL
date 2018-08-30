import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9655
 * BOJ 백준온라인져지 9655 돌 게임 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()) % 2;
        bw.write(N == 0 ? "CY" : "SK");
        bw.flush();
    }
}