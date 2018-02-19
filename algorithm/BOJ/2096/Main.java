import java.util.*;
import java.io.*;
/**
 * 원래는 temp라는 배열을 사용해서 clone해줬는데,
 * 어차피 숫자는 3개라 하드코딩해줬다.
 * 
 * 하드코딩하니 속도랑 메모리쪽에서 효율이 좋음.
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{


        int N = Integer.parseInt(br.readLine());
        int dp[][] = new int[2][3];

        String str1[];
        int a;
        int b;
        int c;

        int temp1, temp2, temp3;
        for(int i = 0; i<N; i++){

            str1 = br.readLine().split(" ");
            a = Integer.parseInt(str1[0]);
            b = Integer.parseInt(str1[1]);
            c = Integer.parseInt(str1[2]);


            temp1 = max(dp[0][0] + a, dp[0][1] + a);
            temp2 = max(dp[0][0] + b, max(dp[0][1] + b, dp[0][2] + b));
            temp3 = max(dp[0][2] + c, dp[0][1] + c);

            dp[0][0] = temp1;
            dp[0][1] = temp2;
            dp[0][2] = temp3;

            temp1 = min(dp[1][0] + a, dp[1][1] + a);
            temp2 = min(dp[1][0] + b, min(dp[1][1] + b, dp[1][2] + b));
            temp3 = min(dp[1][2] + c, dp[1][1] + c);

            dp[1][0] = temp1;
            dp[1][1] = temp2;
            dp[1][2] = temp3;
        }

        bw.write(max(dp[0][0], max(dp[0][1], dp[0][2])) + " " + min(dp[1][0], min(dp[1][1], dp[1][2])));
        bw.flush();
    } 
    private static int max(int a, int b){
        if(a > b)
            return a;
        return b;
    }
    private static int min(int a, int b){
        if(a > b)
            return b;
        return a;
    }
}