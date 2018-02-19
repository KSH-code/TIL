import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        long N = Long.parseLong(br.readLine());
        int check = 0;
        for(long i = 1;i<=N; i++){
            if(N<i){
                break;
            }
            N-=i;
            check++;
        }
        System.out.println(check);
    }
}
