import java.util.*;
import java.io.*;
/**
 * Main
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{

        String str1[] = br.readLine().split(" ");

        int min = Integer.MAX_VALUE;
        int sum = 0;
        int N = Integer.parseInt(str1[0]), M = Integer.parseInt(str1[1]);

        String str2[] = br.readLine().split(" ");
        int arr[] = new int[N];
        int l=0,r=0;
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(str2[i]);
        }
        sum=arr[0];
        while(true){
            if(sum<M){
                r++;
                if(r<N)
                    sum+=arr[r];
                else
                    break;
            }else{
                sum -= arr[l];
                min = Math.min(min, r-l+1);
                l++;
            }
        }
        if(min == Integer.MAX_VALUE)
            bw.write("0");
        else
            bw.write(String.valueOf(min));
        bw.flush();
    }
}