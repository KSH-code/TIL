import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9656
 * BOJ 백준온라인져지 9656 돌 게임 2 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()) % 2;
        bw.write(N == 1 ? "CY" : "SK");
        bw.flush();
    }
}