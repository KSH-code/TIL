import java.io.*;
import java.util.*;

/**
 * BOJ 10952
 * A+B - 5
 */
public class Main {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str1[] = br.readLine().split(" ");
            int n = Integer.parseInt(str1[0]);
            int m = Integer.parseInt(str1[1]);
            if(m==0&&n==0){
                break;
            }
            System.out.println(n+m);
        }
    }
}