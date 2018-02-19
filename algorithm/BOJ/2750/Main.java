import java.util.*;
import java.io.*;

public class Main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int N = Integer.parseInt(br.readLine());
      LinkedList<Integer> list = new LinkedList<>();
      for (int i = 0; i < N; i++) {
         list.add(Integer.parseInt(br.readLine()));
      }
      Collections.sort(list);

      for (int i = 0; i < N; i++) {
         bw.write(String.valueOf(list.removeFirst()));
         bw.write("\n");
      }

      bw.flush();
   }

}