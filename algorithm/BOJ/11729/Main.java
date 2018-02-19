import java.util.*;
import java.io.*;
/**
 * Main
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf((long)Math.pow(2, N)-1));
        bw.write("\n");
        hanoi(N, 1, 2, 3);
        bw.flush();
    }
    private static void move(int f, int t) throws IOException{
        bw.write(String.valueOf(f) + " " + String.valueOf(t));
        bw.write("\n");
    }
    
    private static void hanoi(int n, int from, int by, int to) throws IOException{
        if (n == 1)
            move(from, to);
        else{
            hanoi(n - 1, from, to, by);
            move(from, to);
            hanoi(n - 1, by, from, to);
        }
    }
}