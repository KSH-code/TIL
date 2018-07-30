import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1212
 * BOJ 백준온라인져지 1212 8진수 2진수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int t = str.charAt(0) - (int) '0';
        if ((t & 4) > 0) bw.write('1');
        if ((t & 2) > 0) bw.write('1');
        else if (t > 2) bw.write('0');
        if ((t & 1) > 0) bw.write('1');
        else bw.write('0');
        for (int i = 1; i < str.length(); i++) {
            t = str.charAt(i) - (int) '0';
            bw.write((t & 4) > 0 ? '1' : '0');
            bw.write((t & 2) > 0 ? '1' : '0');
            bw.write((t & 1) > 0 ? '1' : '0');
        }
        bw.flush();
    }
}