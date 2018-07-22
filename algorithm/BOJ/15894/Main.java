import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15894
 * BOJ 백준온라인져지 15894 수학은 체육과목 입니다 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw.write(String.valueOf(Long.parseLong(br.readLine()) * 4));
        bw.flush();
    }
}
