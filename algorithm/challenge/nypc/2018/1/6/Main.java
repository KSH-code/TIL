import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double x = 0;
        double y = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x += Double.parseDouble(st.nextToken());
            y += Double.parseDouble(st.nextToken());
        }
        bw.write(String.valueOf(x / N));
        bw.write(" ");
        bw.write(String.valueOf(y / N));
        bw.flush();
    }
}
