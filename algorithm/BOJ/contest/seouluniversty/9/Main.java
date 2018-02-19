import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s1[] = br.readLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);
        String s2[];
        int L[]=new int[M];
        int S[]=new int[M];
        int K[]=new int[]
        for(int i = 0;i<M;i++){
            s2[] = br.readLine().split(" ");
            L[i] = Integer.parseInt(s2[0]);
            S[i] = Integer.parseInt(s2[1]);

        }
        bw.flush();
    }
}