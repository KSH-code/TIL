import java.util.*;
import java.io.*;
/**
 * BOJ 10803 정사각형 만들기
 * https://gist.github.com/KSH-code/387282e835efe598bf68faea5129c627
 */
/**
 *  아이디어
 *  max % min == 0 => dp[max][min] = max / min
 *  dp[i][2] = 2로 나눠지면 i/2 else i/2 + 2
 *  ============================================================
 *  위에 있는게 아닌 경우 solve way 를 찾아야됨
 *  ============================================================
 *  11/6 2017 첫 번째 방법
 *  dp[i][j] = dp[i-j][j] + 1
 *  ============================================================
 *  11/6 2017 두 번째 방법
 *  i가 홀수면 dp[i][j] = min(dp[i/2][j] + dp[i/2+1][j], i / j + j)
 *  i가 짝수면 dp[i][j] = min(dp[i/2][j] * 2, i / j + j)
 *  위에 방법을 j에도 대입
 *  약간 수정해서 1부터 y/2~x/2 하나씩 해봄
 *  ============================================================
 */
class Main {
    private static int memoization[][] = new int[10001][101];    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);


        int max = max(N, M);
        int min = min(N, M);
        for(int i = 1; i<=max; i++){
            memoization[i][1] = i;
            if(i <= min){
                memoization[i][i] = 1;
            }
            if(i >= 3){
                if(i % 2 == 0){
                    memoization[i][2] = i / 2;
                }else{
                    memoization[i][2] = i / 2 + 2;
                }
            }
        }
        dp(max, min);

        bw.write(String.valueOf(memoization[max][min]));
        bw.flush();
    }
    private static int dp(int x, int y){
        int tempMax = max(x, y);
        int tempMin = min(x, y);
        x = tempMax;
        y = tempMin;
        if(memoization[x][y] == 0){
            int min = 12341234;
            if(x % y == 0){
                return memoization[x][y] = min(x/y, min);
            }
            if(x >= y * 3){
                return memoization[x][y] = dp(x-y, y) + 1;
            } 
            for(int i=1; i<= x / 2; i++){
                min = min(min, dp(x - i, y) + dp(i, y));
            }
            for(int i=1; i<= y / 2; i++){
                min = min(min, dp(x, y-i) + dp(x, i));
            }
            return memoization[x][y] = min;
        }else{
            return memoization[x][y];
        }
    }
    private static int max(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    private static int min(int a, int b){
        if(a < b){
            return a;
        }else{
            return b;
        }
    }
}
// 첫 번째 아이디어 실패.
// for(int i = 1; i<=max; i++){
//     for(int j = 1; j<=min; j++){
//         if(dp[i][j] == 0 && i > 2 && j != 2){
//             int minTemp = max(i, j) - min(i, j);
//             int maxTemp = min(i, j);
//             if(i == 6 && j == 5 || minTemp < 0){
//                 System.out.println(i);
//                 System.out.println(j);
//                 System.out.println(maxTemp);
//                 System.out.println(minTemp);
//             }
//             dp[i][j] = dp[maxTemp][minTemp] + 1;
//         }
//     }
// }