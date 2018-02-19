import java.io.*;
import java.util.*;
class Main{
    private static long f[][]=new long[1001][1001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        System.out.println(F(x,y));
    }
    private static long F(int x,int y){
        long result;
        if(x==1||y==1){
            return 1;
        }
        if(f[x][y]==0){
            f[x][y]=(F(x-1,y)+F(x,y-1)+F(x-1,y-1))%1000000007;
        }
        result=f[x][y];
        return result;
    }
}