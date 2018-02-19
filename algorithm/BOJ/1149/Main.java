import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int rgb[][];
		int n = Integer.parseInt(br.readLine());
		rgb = new int[n][3];
		int dp[][] = new int[n][3];
		for (int i = 0; i < n; i++) {
			String str1[] = br.readLine().split(" ");
			rgb[i][0] = Integer.parseInt(str1[0]);
			rgb[i][1] = Integer.parseInt(str1[1]);
			rgb[i][2] = Integer.parseInt(str1[2]);
		}
		for (int j = 0; j < 3; j++)
			dp[0][j] = rgb[0][j];

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (k == j)
						continue;
					if (dp[i][j] == 0)
						dp[i][j] = dp[i - 1][k] + rgb[i][j];
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + rgb[i][j]);
				}
			}
		}
		bw.write(String.valueOf(Math.min(dp[n - 1][2], Math.min(dp[n - 1][0], dp[n - 1][1]))));
		bw.flush();
	}

}