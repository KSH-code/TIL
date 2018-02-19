import java.io.*;
import java.util.*;
class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int temp;
        int dp[] = new int[N];
        for(int i = 1; i<N; i++){
            String str1[] = br.readLine().split(" ");
            temp = max;
            for(int j = 0; i<i+1; j++){
                dp[]
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}