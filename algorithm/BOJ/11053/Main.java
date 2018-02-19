import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        int list[] = new int[N];
        int dp[] = new int[N];
        int max = 0;
        for(int i = 0;i<N;i++){
            list[i] = Integer.parseInt(str1[i]);
            for(int j = 0;j<i;j++){
                if(list[j]<list[i]){
                    if(dp[i]<dp[j])
                        dp[i]=dp[j];
                }
            }
            dp[i] += 1;
            if(dp[i]>max){
                max=dp[i];
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}
