import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5430
 * BOJ 백준온라인져지 5430 AC 풀이
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            String str1[] = br.readLine().split("");
            int N = Integer.parseInt(br.readLine());
            String str2 = br.readLine();
            ArrayList<String> arr = new ArrayList<>(Arrays.asList(str2.substring(1, str2.length() - 1).split(",")));
            boolean escape = false;
            boolean isReverse = false;
            for (String command : str1) {
                if (escape) break;
                switch (command) {
                    case "R":
                        isReverse = !isReverse;
                        break;
                    default:
                        if (arr.size() == 0 || N == 0) {
                            bw.write("error\n");
                            escape = true;
                        } else {
                            if (isReverse) arr.remove(arr.size() - 1);
                            else arr.remove(0);
                        }
                        break;
                }
            }
            if (!escape) {
                bw.write("[");
                StringBuilder temp = new StringBuilder("");
                if (isReverse) {
                    for (int i = arr.size() - 1; i >= 0; i--) {
                        temp.append(arr.get(i));
                        temp.append(",");
                    }
                } else {
                    for (int i = 0; i < arr.size(); i++) {
                        temp.append(arr.get(i));
                        temp.append(",");
                    }
                }
                if (temp.length() > 0) bw.write(temp.substring(0, temp.length() - 1));
                else bw.write(temp.toString());
                bw.write("]\n");
            }
        }
        bw.flush();
    }
}