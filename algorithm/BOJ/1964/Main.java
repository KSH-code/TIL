import java.util.*;
import java.io.*;

public class Main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int N = Integer.parseInt(br.readLine());
      int result = 5;
      for (int i = 2; i <= N; i++) {
         result = (result + (3 * i + 1)) % 45678;
      }
      bw.write(String.valueOf(result));
      bw.flush();
   }

}