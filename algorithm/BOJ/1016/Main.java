import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N,M;
        String str1[] = br.readLine().split(" ");
        boolean pow[] = new boolean[1000000+1];
        double sq;
        N = Long.parseLong(str1[0]);
        M = Long.parseLong(str1[1]);
        Arrays.fill(pow, true);
        for(int i = 2;i<=1000;i++){
            if(pow[i]){
				for(int j = i*i; j<=1000000; j+=i) pow[j]=false;
			}
        }
        long sum = 0;
        for(long i = N;i<=M;i++){
            for(int j = 2;j<=1000000;j++){
                if(pow[j])
                    if(i%j==0){
                        sum++;
                        break;
                    }
            }
        }
        System.out.println(M-N-sum+1);
    }
}