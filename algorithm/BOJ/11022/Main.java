import java.io.*;
import java.util.*;

/**
 * BOJ 11022
 * A+B - 8
 */
public class Main {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str1[] = br.readLine().split(" ");
            int n = Integer.parseInt(str1[0]);
            int m = Integer.parseInt(str1[1]);
            System.out.println("Case #" + (i+1) + ": " + n + " + " + m + " = " + (n+m));
        }
    }
}