import java.io.*;
import java.util.*;

class Main {
    private static int mod = (int)1e9+7;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int N = Integer.parseInt(br.readLine());
        String str1[];
        long result = 0;
        int coefficient;
        long degree;
        long temp;
        long temp2;
        for(int i = 0;i<N;i++){
            str1 = br.readLine().split(" ");
            coefficient = Integer.parseInt(str1[0]);
            degree = Integer.parseInt(str1[1]);
            if(degree == 0){
            }else if(degree == 1){
                result = (result + coefficient) % mod;
            }else{
                temp = coefficient * degree % mod;
                degree--;
                temp2 = 2;
                while(degree > 0){
                    if((degree & 1) > 0)
                        temp = temp2 * temp % mod;
                    temp2 = temp2 * temp2 % mod;
                    degree/=2;
                }
                result = (result + temp) % mod;
            }
        }
        System.out.println(result);
    }
}
