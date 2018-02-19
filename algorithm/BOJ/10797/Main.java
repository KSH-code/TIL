
import java.io.*;
import java.util.*;

/**
 *  BOJ 10797 10부제
 *  https://gist.github.com/KSH-code/c0dc8e38c86335f59a41984caf82a5e4
 */
public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        int result = 0;
        for(int i = 0; i<5; i++){
            if(N == Integer.parseInt(str1[i]))
                result++;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }

}