import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            String str1[] = br.readLine().split(" ");
            int temp = Integer.parseInt(str1[0]);
            int length = Integer.parseInt(str1[1]) - 1;
            int result = temp;
            if(result > 1)
                for(int j = 0; j<length; j++)
                    result = (result * temp) % 10;
            if(result % 10 == 0)
                bw.write("10");
            else
                bw.write(String.valueOf(result % 10));
            bw.write("\n");
        }
        bw.flush();
    }

}