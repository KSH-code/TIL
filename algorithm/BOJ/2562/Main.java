import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2562
 * BOJ 백준온라인져지 2562 최대값 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int maxNumber = 0;
        int maxIdx = 0;
        for (int i = 1; i <= 9; i++) {
            int number = Integer.parseInt(br.readLine());
            if (maxNumber < number) {
                maxIdx = i;
                maxNumber = number;
            }
        }
        bw.write(maxNumber + "\n");
        bw.write(String.valueOf(maxIdx));
        bw.flush();
    }
}