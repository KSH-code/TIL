
import java.util.*;
import java.io.*;

public class Main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int N = Integer.parseInt(br.readLine());
      String str1;
      Stack<Character> parenthesisString = new Stack<>();
      for (int i = 0; i < N; i++) {
         parenthesisString.clear();
         str1 = br.readLine();
         int length = str1.length();
         if (length % 2 == 1) {
            bw.write("NO");
         } else {
            for (int j = 0; j < length; j++) {
               parenthesisString.push(str1.charAt(j));
            }
            int closed = 0;
            boolean check = false;
            while (!parenthesisString.isEmpty()) {
               if (parenthesisString.pop() == '(') {
                  if (closed > 0) {
                     closed--;
                  } else {
                     check = true;
                     bw.write("NO");
                     break;
                  }
               } else {
                  closed++;
               }
            }
            if (closed > 0)
               bw.write("NO");
            if (!check && closed == 0)
               bw.write("YES");
         }
         bw.write("\n");
      }

      bw.flush();
   }

}