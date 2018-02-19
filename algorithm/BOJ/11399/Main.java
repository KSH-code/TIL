import java.io.*;
import java.util.*;
class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        int dp[] = new int[N];
        
        for(int i = 0; i<N; i++){
            dp[i] = Integer.parseInt(str1[i]);
        }
        Arrays.sort(dp);
        int sum = dp[0];
        for(int i = 1; i<N; i++){
            sum += dp[i] = dp[i-1] + dp[i];
        }
        System.out.println(sum);
    }
}