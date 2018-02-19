import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1[] = br.readLine().split(" ");
        long sum = 0;
        long N = Long.parseLong(str1[0]);
        long M = Long.parseLong(str1[1]);
        if(M<N){
            long temp = M;
            M = N;
            N = temp;
        }
        sum = (N+M) * (M-N+1) / 2;
        System.out.println(sum);
    }
}
