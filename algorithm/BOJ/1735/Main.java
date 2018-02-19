import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1[] = br.readLine().split(" ");
        String str2[] = br.readLine().split(" ");
        int a=Integer.parseInt(str1[0]);
        int b=Integer.parseInt(str1[1]);
        int c=Integer.parseInt(str2[0]);
        int d=Integer.parseInt(str2[1]);
        int dnl = 0;
        int _gcd = gcd(b, d);
        int dkfo = b * d / _gcd;

        dnl += a * (dkfo / b);
        dnl += c * (dkfo / d);

        while((_gcd = gcd(dnl, dkfo))> 1){
            dnl /= _gcd;
            dkfo /= _gcd;
        }
        System.out.println(dnl + " " + dkfo);
    }
    private static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b % a, a);
    }
}
