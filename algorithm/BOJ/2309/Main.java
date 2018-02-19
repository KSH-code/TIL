import java.io.*;
import java.util.*;

/**
 * BOJ 2309 일곱 난쟁이
 * https://gist.github.com/KSH-code/5d0af23c0bd3317ce83254be13a672f9
 */
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = 9;

        LinkedList<Integer> linkedList = new LinkedList<>();
        int d[] = new int[9];
        int all = 0;
        for(int i = 0; i<N; i++){
            all += d[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0; 
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(i==j) continue;
                if(all-d[i]-d[j] == 100){
                    d[j]=d[i]=Integer.MAX_VALUE;
                }
            }
        }
        Arrays.sort(d);
        for(int i = 0; i<7; i++){
            bw.write(d[i] + "\n");
        }
        bw.flush();

    }
}