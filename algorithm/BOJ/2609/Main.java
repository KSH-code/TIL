import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str1[] = br.readLine().split(" ");
		int a = Integer.parseInt(str1[0]), b = Integer.parseInt(str1[1]);
		int gcd = gcd(a, b);
		bw.write(String.valueOf(gcd) + " " + String.valueOf(a * b / gcd));
		bw.flush();
	}

	private static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}

}
