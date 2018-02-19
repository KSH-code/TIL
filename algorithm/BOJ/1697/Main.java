import java.util.*;
import java.io.*;

public class Main {
    private static int min = Integer.MAX_VALUE;
    private static int N,K;
    private static int dp[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");
		N = Integer.parseInt(str1[0]);
        K = Integer.parseInt(str1[1]);

        dp = new int[1000000];
        Arrays.fill(dp, Integer.MAX_VALUE);

        if(K <= N)
            dp[K] = N - K;
        else
            move();

        
        bw.write(String.valueOf(dp[K]));
		bw.flush();
    }
    private static void move(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        dp[N] = 0;
        int temp = 0;
        while(!queue.isEmpty()){
            temp = queue.poll();
            try{
                if(dp[temp] + 1 < dp[temp + 1]){
                    dp[temp + 1] = dp[temp] + 1;
                    queue.add(temp + 1);
                }
            }catch(Exception e){

            }
            try{
                if(dp[temp] + 1 < dp[temp * 2]){
                    dp[temp * 2] = dp[temp] + 1;
                    queue.add(temp * 2);
                }
            }catch(Exception e){

            }
            try{
                if(dp[temp] + 1 < dp[temp - 1]){
                    dp[temp - 1] = dp[temp] + 1;
                    queue.add(temp - 1);
                }
            }catch(Exception e){

            }
        }
    }
}