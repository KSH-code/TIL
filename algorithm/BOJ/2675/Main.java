import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String RS = br.readLine().trim();
            int R = Integer.parseInt(RS.split(" ")[0]);
            String S = RS.split(" ")[1];
            for (int i = 0; i < S.length(); i++) {
                char s = S.charAt(i);
                for (int j = 0; j < R; j++) {
                    bw.write(s);
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}