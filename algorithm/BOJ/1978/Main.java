import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isNotPrime[] = new boolean[1001];
        isNotPrime[1] = true;
        for(int i = 2; i<=1000; i++){
            double sq = Math.sqrt(i);
            for(int j = 2; j <= sq; j++){
                if(i % j ==0){
                    isNotPrime[i] = true;
                    break;
                }
            }
        }

        int sum = 0;
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            int idx = Integer.parseInt(str1[i]);
            if(!isNotPrime[idx]){
                sum++;
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
    }
}