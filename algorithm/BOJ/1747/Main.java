import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1747
 * BOJ 백준온라인져지 1747 소수&팰린드롬 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean isPrimeNumber[] = new boolean[2000001];
        for (int i = 2; i <= 2000000; i++) isPrimeNumber[i] = true;
        for (int i = 2; i <= 1000; i++) {
            if (isPrimeNumber[i])
                for (int j = i * i; j <= 2000000; j += i) {
                    isPrimeNumber[j] = false;
                }
        }
        int N = Integer.parseInt(br.readLine());
        while (true) {
            if (isPrimeNumber[N] && isPalindrome(N)) {
                bw.write(String.valueOf(N));
                break;
            }
            N++;
        }
        bw.flush();
    }
    private static boolean isPalindrome (int N) {
        String str = String.valueOf(N);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
    }
}