import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		long dp[][] = new long[n][10];
		Arrays.fill(dp[0], 1);
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j == 0)
					dp[i][j] = dp[i - 1][1];
				else if (j == 9)
					dp[i][j] = dp[i - 1][j - 1];
				else
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
			}
		}
		long sum = 0;
		for (int i = 1; i <= 9; i++)
			sum = (sum + dp[n - 1][i]) % 1000000000;
		bw.write(String.valueOf(sum));
		bw.flush();
	}

}// 9 17 32 62
