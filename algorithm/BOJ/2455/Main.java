import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2455
 * BOJ 백준온라인져지 2455 지능형 기차 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cur = 0;
        int result = 0;

        for (int i = 0; i < 4; i++) {
            String str1[] = br.readLine().split(" ");
            int out = Integer.parseInt(str1[0]);
            int in = Integer.parseInt(str1[1]);
            cur += in - out;
            if (result < cur) result = cur;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}