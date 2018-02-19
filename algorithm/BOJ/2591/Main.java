import java.io.*;
import java.util.*;
/**
 *  BOJ 2591 숫자카드
 *  https://gist.github.com/KSH-code/620b7c790d2e820c56c984b1ae2addca
 *  주석처리가 된 곳은 Memorization을 사용하지 않은 부분
 *  또는
 *  노트가 없어서 걍 풀이 흔적
 */
class Main{
    // private static int result = 0; private static char ss[]; 
    private static int length;
    private static String s;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        length = s.length();
        
        int slicedNumber[] = new int[100];
        for(int i = 0; i<s.length(); i++){
            slicedNumber[i] = s.charAt(i) - 48;
        }

        // 2 7 1 2 3
        // 1 1
        // 1 1 2 3 5 6
        int dp[] = new int[100];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 1; i<length+1; i++){
            if(slicedNumber[i-1] == 0){
                if(slicedNumber[i-2] > 0 && slicedNumber[i-2]*10 + slicedNumber[i-1] <= 36){
                    dp[i] = dp[i-2];                
                }else{
                    System.out.println(0);
                    return;
                }
            }else{
                dp[i] = dp[i - 1];
                if(i-2>=0){
                    if(slicedNumber[i-2] > 0 && slicedNumber[i-2]*10 + slicedNumber[i-1] <= 36){
                        dp[i] = dp[i-2] + dp[i-1];
                    }
                }
            }
        }
        System.out.println(dp[s.length()]);
        // ss = s.toCharArray();

        // gogo("", 0);
        // System.out.println(result);
    }
    // private static void gogo(String t, int idx){
    //     if(t.length() >= length){
    //         if(t.length() == length)
    //             result++;
    //         return;
    //     }else{
    //         String Stemp = String.valueOf(ss[idx]);
    //         if(idx + 2 <= length){
    //             String Stemp2 = Stemp + String.valueOf(ss[idx + 1]);
    //             if(Integer.parseInt(Stemp2) <= 36 && ss[idx] != '0'){
    //                 gogo(t + Stemp2, idx+2);
    //             }
    //         }
    //         if(ss[idx] != '0'){
    //             gogo(t + Stemp, idx+1);
    //         }
    //     }
    // }
}