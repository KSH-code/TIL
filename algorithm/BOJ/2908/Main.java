
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N[] = br.readLine().split(" ");
		int max = 0, temp = 0;
		for (int i = 0; i < N.length; i++) {
			temp = Integer.parseInt(new StringBuilder(N[i]).reverse().toString());
			if (max < temp) {
				max = temp;
			}
		}
		bw.write("" + max);
		bw.flush();
	}

}
