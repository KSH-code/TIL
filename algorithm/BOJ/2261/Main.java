import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long min = Long.MAX_VALUE;
        int N = Integer.parseInt(br.readLine());
        int x[] = new int[N];
        int y[] = new int[N];
        String str1[];
        for(int i = 0;i < N; i++){
            str1 = br.readLine().split(" ");
            x[i] = Integer.parseInt(str1[0]);
            y[i] = Integer.parseInt(str1[1]);
        }
        long distance;
        for(int i = 0;i < N;i ++){
            for(int j = 0;j < N;j++){
                if(i==j) continue;
                distance = (long)(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                if(min > distance) min = distance;
            }
        }
        System.out.println(min);
    }
}
