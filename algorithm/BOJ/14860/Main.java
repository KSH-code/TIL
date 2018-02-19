import java.io.*;
import java.util.*;

/**
 * BOJ 14860 GCD 곱
 */
public class Main{
    private static final int MOD = (int)(1e+9)+7;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]), M = Integer.parseInt(str1[1]);
        long result = 1;
        for(int i = 2; i<=N; i++){
            for(int j = 2; j<=M; j++){
                result=result*gcd(i,j)%MOD;
            }
        }
        System.out.println(result);
    }
    private static int gcd(int a, int b){
        if(a%b == 0)
            return b;
        return gcd(b%a, a);
    }
}