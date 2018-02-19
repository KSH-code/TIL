
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int list[] = new int[N];
		int dp[] = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = list[0];
		if (N > 0)
			dp[1] = dp[0] + list[1];
		if (N > 2)
			dp[2] = Math.max(list[2] + list[0], list[2] + list[1]);
		for (int i = 3; i < N; i++) {
			dp[i] = Math.max(dp[i - 2] + list[i], dp[i - 3] + list[i] + list[i - 1]);
		}
		bw.write(String.valueOf(dp[N - 1]));
		bw.flush();
	}

}
