import java.io.*;
import java.util.*;

/**
 * BOJ 12852 대표값2
 * https://gist.github.com/KSH-code/5b232e215160820e8a645ffd6fb0190e
 */
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = new int[5];
        int sum = 0;
        for(int i = 0; i<5; i++){
            sum += arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        bw.write((sum / 5) + "\n");
        bw.write(String.valueOf(arr[2]));
        bw.flush();
    }
}