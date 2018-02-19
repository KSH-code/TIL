
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 0; i < N; i++) {
			String n = br.readLine();
			boolean check[] = new boolean[26];
			boolean is = true;
			for (int j = 0, length = n.length() - 1; j < length; j++) {
				if (n.charAt(j) != n.charAt(j + 1)) {
					if (check[(int) n.charAt(j + 1) - 97]) {
						is = false;
						break;
					}
					check[(int) n.charAt(j) - 97] = true;
				}
			}
			if (is) {
				result++;
			}
		}
		bw.write("" + result);
		bw.flush();
	}

}
