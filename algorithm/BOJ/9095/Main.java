import java.io.*;
import java.util.*;
class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[12];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int j = 0; j<N; j++){
            int temp = Integer.parseInt(br.readLine());
            if(dp[temp] == 0)
                for(int i=4; i<=temp; i++)
                    dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            bw.write(dp[temp] + "\n");
        }
        bw.flush();
    }
}