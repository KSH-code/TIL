import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++){
            String str1[] = br.readLine().split(" ");
            int M = Integer.parseInt(str1[0]);
            int T[] = new int[M];
            long sum = 0;
            for(int j = 0; j<M; j++){
                T[j] = Integer.parseInt(str1[j + 1]);
            }
            for(int j = 0; j<M-1; j++){
                for(int k = j+1; k<M; k++){
                    sum += gcd(T[j], T[k]);
                }
            }
            bw.write(String.valueOf(sum) + "\n");
        }

        bw.flush();
    }

    private static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b % a, a);
    }
}