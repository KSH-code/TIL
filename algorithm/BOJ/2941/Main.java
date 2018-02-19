
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		int length = N.length(), result = 0;
		try {
			for (int i = 0; i < length; i++) {
				result++;
				switch (N.substring(i, i + 2)) {
				case "c=":
				case "c-":
				case "d-":
				case "lj":
				case "nj":
				case "s=":
				case "z=":
					i++;
					break;
				default:
					if (N.charAt(i) == 'd')
						if (N.charAt(i + 1) == 'z')
							if (N.charAt(i + 2) == '=')
								i += 2;
					break;
				}
			}
		} catch (Exception e) {

		}
		bw.write("" + result);
		bw.flush();
	}

}
