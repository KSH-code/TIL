import java.util.*;
import java.io.*;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(br.readLine());
        int a = (int) Math.ceil((double) W / P);
        int b = 0;
        while (true) {
            if (P * a + Q * b == W) break;
            a--;
            if ((W - P * a) % Q == 0) {
                b += (W - P * a - Q * b) / Q;
            }
        }
        System.out.println(a + " " + b);
        bw.flush();
    }
}
