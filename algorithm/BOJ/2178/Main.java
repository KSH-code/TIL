import java.util.*;
import java.io.*;

public class Main {
	static boolean c[][];
	static int min[][];
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str1[] = br.readLine().split(" ");
		N = Integer.parseInt(str1[0]);
		M = Integer.parseInt(str1[1]);
		String str2;
		c = new boolean[N][M];
		min = new int[N][M];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				min[i][j] = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			str2 = br.readLine();
			for (int j = 0; j < M; j++)
				c[i][j] = str2.charAt(j) == '1';
		}
		BFS();
		bw.write(String.valueOf(min[N - 1][M - 1]));
		bw.flush();
	}

	private static void BFS() {
		Queue<Integer> queue = new LinkedList<>();
		int x = 0, y = 0;
		int check = x * 1000 + y;
		queue.offer(check);
		min[x][y] = 1;
		while (!queue.isEmpty()) {
			check = queue.poll();
			x = check / 1000;
			y = check % 1000;
			if (x - 1 >= 0) {
				if (c[x - 1][y]) {
					if (min[x - 1][y] > min[x][y] + 1) {
						min[x - 1][y] = min[x][y] + 1;
						queue.offer((x - 1) * 1000 + y);
					}
				}
			}
			if (y + 1 < M) {
				if (c[x][y + 1]) {
					if (min[x][y + 1] > min[x][y] + 1) {
						min[x][y + 1] = min[x][y] + 1;
						queue.offer(x * 1000 + y + 1);
					}
				}
			}
			if (y - 1 >= 0) {
				if (c[x][y - 1]) {
					if (min[x][y - 1] > min[x][y] + 1) {
						min[x][y - 1] = min[x][y] + 1;
						queue.offer(x * 1000 + y - 1);
					}
				}
			}
			if (x + 1 < N) {
				if (c[x + 1][y]) {
					if (min[x + 1][y] > min[x][y] + 1) {
						min[x + 1][y] = min[x][y] + 1;
						queue.offer((x + 1) * 1000 + y);
					}
				}
			}
		}
	}
}