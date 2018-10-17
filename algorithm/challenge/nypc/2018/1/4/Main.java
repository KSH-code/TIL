import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean i = false;
        while (a > 0 && b >= 0) {
            if (b == 0) {
                if (a == 1) {
                    System.out.println("POSSIBLE");
                    i = true;
                }
                break;
            }
            if (a > b) {
                int ta = a;
                a -= (a - b) / b * b;
                if (ta == a) a -= b;
            } else if (b > a) {
                int tb = b;
                b -= (b - a) / a * a;
                if (tb == b) b -= a;
            } else {
                b -= a;
            }
        }
        if (!i) System.out.println("IMPOSSIBLE");
    }
}
