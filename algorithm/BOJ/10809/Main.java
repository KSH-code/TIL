import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String N = br.readLine();
        char checks[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(char check : checks){
            bw.write(N.indexOf(check)+" ");
        }
        bw.flush();
    }
}