import java.io.*;
import java.util.*;

/**
 * BOJ 11727 2×n 타일링 2
 */
public class Main{
    static final int MOD = (int)(1e+4)+7;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+1];
        dp[0] = 1;
        dp[1] = 1;
        if(N>=2){
            dp[2] = 2;
        }
        for(int i = 3; i<=N; i++){
            dp[i] = (dp[i - 1] + dp[i-2]*2)%MOD;
        }
        System.out.println(dp[N]);
    }
}