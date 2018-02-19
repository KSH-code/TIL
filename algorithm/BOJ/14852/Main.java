import java.io.*;
import java.util.*;

/**
 * BOJ 14852 타일채우기 3
 * https://gist.github.com/KSH-code/aaf918ce45a1ca3da9705f4a83aae78b
 */
public class Main{
    private static final int MOD = (int)(1e+9)+7;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        long dp[] = new long[N+10];
        long dp2[] = new long[N+10];
        dp[1]=2;
        dp[2]=7;
        dp[3]=22;
        dp2[3]=1;
        for(int i = 4; i<=N; i++){
            dp2[i] = (dp2[i-1]+dp[i-3])%MOD;
            dp[i] = (dp[i-2]*3+dp[i-1]*2+dp2[i]*2)%MOD; 
        }
        System.out.println(dp[N]);
    }
}