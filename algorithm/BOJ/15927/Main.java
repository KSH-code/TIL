import java.util.*;
import java.io.*;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/15927
 * BOJ 백준온라인져지 15927 회문은 회문아니야!! 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (!isPalindrome) bw.write(String.valueOf(str.length()));
        else {
            int i = 1;
            while (i < str.length()) {
                if (str.charAt(i) != str.charAt(0)) {
                    isPalindrome = false;
                    break;
                }
                i++;
            }
            if (!isPalindrome) bw.write(String.valueOf(str.length() - 1));
            else bw.write("-1");
        }
        bw.flush();
    }
}