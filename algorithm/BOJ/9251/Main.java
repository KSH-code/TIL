import java.util.Arrays;
import java.io.*;

public class Main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = " " + br.readLine();
        String str2 = " " + br.readLine();
        char A[] = str1.toCharArray();
        char B[] = str2.toCharArray();
        int lcs[][] = new int[B.length][A.length];

        for (int i = 1; i < B.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j] == B[i]) {
                    lcs[i][j]=lcs[i-1][j-1]+1;
                } else {
                    lcs[i][j] = Math.max(lcs[i][j - 1], lcs[i - 1][j]);
                }
            }
        }
        System.out.println(lcs[B.length - 1][A.length - 1]);
   }

}