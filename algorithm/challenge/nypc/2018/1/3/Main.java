import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/kimseonghoon/Downloads/input5.5.1.txt"));
        BufferedReader br = new BufferedReader(new FileReader("/Users/kimseonghoon/Downloads/input5.5.txt"));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                bw.write(st.nextToken().charAt(0));
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
