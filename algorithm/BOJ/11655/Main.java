import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11655
 * BOJ 백준온라인져지 11655 ROT13 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp >= 'a' && temp <= 'z') {
                temp = (char)(temp + 13);
                if (temp > 'z') temp = (char)(temp - 'z' + 'a' - 1);
            } else if (temp >= 'A' && temp <= 'Z') {
                temp = (char)(temp + 13);
                if (temp > 'Z') temp = (char)(temp - 'Z' + 'A' - 1);
            }
            bw.write(temp);
        }
        bw.flush();
    }
}