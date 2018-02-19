import java.io.*;
import java.util.*;

/**
 * BOJ 12852 1로 만들기 2
 * https://gist.github.com/KSH-code/97ac76b0518de5a02806170c11ab1a57
 */
public class Main{
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int dp[][] = new int[(int)(1e+6)+1][2];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<dp.length; i++){
            dp[i][0] = Integer.MAX_VALUE;
        }
        dp[N][0] = 0;        
        calc(N);
        bw.write(dp[1][0] + "\n");
        Stack<Integer> list = new Stack<>();
        int i = 1;
        if(N == 2){
            bw.write("2 ");
        }else{
            while(list.size() != dp[1][0]){
                list.push(i = dp[i][1]);
            }
            while(!list.isEmpty()){
                bw.write(list.pop() + " ");
            }
        }
        bw.write("1");
        bw.flush();
    }
    private static void calc(int N) throws IOException {
        if(N == 1){
            return;
        }
        if(N % 3 == 0){
            if(dp[N / 3][0] >= dp[N][0] + 1){
                dp[N / 3][0] = dp[N][0] + 1;
                dp[N / 3][1] = N;
                calc(N / 3);
            }
        }
        if(N % 2 == 0){
            if(dp[N / 2][0] >= dp[N][0] + 1){
                dp[N / 2][0] = dp[N][0] + 1;
                dp[N / 2][1] = N;
                calc(N / 2);
            }
        }

        if(dp[N - 1][0] >= dp[N][0] + 1){
            dp[N - 1][0] = dp[N][0] + 1;
            dp[N - 1][1] = N;
            calc(N - 1);
        }
    }
}