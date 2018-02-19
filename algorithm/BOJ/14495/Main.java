import java.io.*;
import java.util.*;
class Main{
    private static long f[] = new long[117];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(F(n));
    }
    private static long F(int n){
        if(n<=3){
            return 1;
        }
        long result;
        if(f[n]==0){
            f[n]=F(n-1)+F(n-3);
        }
        result=f[n];
        return result;
    }
}