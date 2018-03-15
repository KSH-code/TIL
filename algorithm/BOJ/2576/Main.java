import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2576
 * BOJ 백준온라인져지 2576 홀수 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < 7; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number % 2 == 1) {
                result += number;
                if (min > number) min = number;
            }
        }
        if (result == 0) {
            System.out.println(-1);
            return;
        }
        bw.write(result + "\n");
        bw.write(String.valueOf(min));
        bw.flush();
    }
}