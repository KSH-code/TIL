import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N,M;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        int min = -1;
        int sum = 0;
        for(int i = N;i<=M;i++){
            if(i == 1)
                continue;
            double sq = Math.sqrt(i);
            boolean check = false;
            for(int j = 2;j<=sq;j++){
                if(i % j == 0){
                    check = true;
                    break;
                }
            }
            if(!check){
                if(min == -1){
                    min = i;
                }
                sum+=i;
            }
        }
        if(min == -1){
            System.out.println(min);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}