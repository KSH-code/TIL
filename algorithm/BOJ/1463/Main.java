import java.util.*;
import java.io.*;
class Main{
    private static int dp[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine());
        dp = new int[x+1];
        int ret = dp[x];
        int d3, d2, d1;
        dp[1]=0;
        for(int i = 2; i <= x; i++){
			d3 = d2 = d1 = 1000001;
			if(i % 3 == 0){
				d3 = dp[i/3] + 1;
			}			
			if(i % 2 == 0){
				d2 = dp[i/2] + 1;
			}
			d1 = dp[i-1] + 1;
			
			dp[i] = Math.min(d1, Math.min(d2, d3));
		}
        bw.write(String.valueOf(dp[x]));
        bw.flush();

    }

}