import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15719
 * BOJ 백준온라인져지 15719 중복된 숫자 풀이
 */
public class Main {
	private static byte[] buffer = new byte[78888905];
	private static int next;
	private static int b;
    public static void main(Strin g args[]) t hrows IOException {
        System.in.read(buffer, 0,  buffer.len gt

        long N = nextInt();
        long sum = 0;
        for (int i = 0; i < N; i++) {

        }
        // sum - n(n - 1) / 2 = m
        System.out.println(sum - (N * (N - 1) / 2));
    }
	private static long nextInt() {
		long n = buffer[next++] - '0';
		while ((b = buffer[next++]) >= '0')
			n = (n * 10) + (b - '0');
		return n;
	}
}