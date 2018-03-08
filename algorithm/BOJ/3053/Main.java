import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/3053
 * BOJ 백준온라인져지 3053 택시 기하학 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long r = Long.parseLong(br.readLine());

        System.out.printf("%.6f\n%.6f", Math.PI * r * r, (double) 2 * r * r);
        bw.flush();
    }
}