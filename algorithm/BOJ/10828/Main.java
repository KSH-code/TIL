import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		String str;
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			if (str.contains("push")) {
				stack.push(Integer.parseInt(str.split(" ")[1]));
			} else if (str.contains("pop")) {
				if (stack.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(String.valueOf(stack.pop()) + "\n");
				}
			} else if (str.contains("size")) {
				bw.write(String.valueOf(stack.size()) + "\n");
			} else if (str.contains("empty")) {
				if (stack.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if (str.contains("top")) {
				if (stack.isEmpty())
					bw.write("-1\n");
				else
					bw.write(String.valueOf(stack.get(stack.size() - 1)) + "\n");
			}
		}
		bw.flush();
	}

}
//2
//2
//0
//2
//1
//-1
//0
//1
//-1
//0
//3