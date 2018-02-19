import java.io.*;
import java.util.*;
public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        int fibo[] = new int[N + 1];
        fibo[1] = 1;
        for(int i = 2; i<=N; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println(String.valueOf(fibo[N]));
    }
}