
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int list[] = new int[N];
		int dp[] = new int[N];
		int max;
		String str1[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(str1[i]);
		}
		Arrays.fill(dp, 0);
		max = dp[0] = list[0];

		for (int i = 1; i < N; i++) {
			if (dp[i - 1] + list[i] >= list[i]) {
				dp[i] = dp[i - 1] + list[i];
			} else
				dp[i] = list[i];
			if (dp[i] > max) {
				max = dp[i];
			}
		}
		bw.write(String.valueOf(max));
		bw.flush();
	}

}
