
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int result = 1, check = 0;
		N--;
		int i = 1;
		for (; N >= 3 * i * i - 3 * i + 1; i++)
			;
		bw.write("" + i);
		bw.flush();
	}

}
