import java.util.*;
import java.io.*;
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            String str1[] = br.readLine().split(" ");
            int sum = Integer.parseInt(str1[0]) + Integer.parseInt(str1[1]);
            bw.write("Case #"+ (i + 1) + ": " + sum + "\n");
        }
        bw.flush();
    }
}