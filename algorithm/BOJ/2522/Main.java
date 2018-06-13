import java.util.*;
import java.io.*;
/**
 * https://www.acmicpc.net/problem/2522
 * BOJ 백준온라인져지 2522 별 찍기 - 12 풀이
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			for (int j = N; i < j; j--) bw.write(" ");
			for (int j = 0; j < i; j++) bw.write("*");
			bw.write("\n");
		}
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) bw.write(" ");
			for (int j = 1; j <= N - i; j++) bw.write("*");
			bw.write("\n");
		}
		bw.flush();
	}
}
