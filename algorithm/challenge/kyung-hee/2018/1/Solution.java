import java.util.*;
import java.io.*;
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static String str;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        int result = 0;
        String temp = "";
        while (true) {
            result++;
            if (temp.length() < 5) temp += 'A';
            else {
                String t = "";
                boolean isUp = true;
                for (int i = 4; i >= 0; i--) {
                    char tempChar = temp.charAt(i);
                    if (isUp) {
                        isUp = false;
                        if (tempChar == 'A') tempChar = 'E';
                        else if (tempChar == 'E') tempChar = 'I';
                        else if (tempChar == 'I') tempChar = 'O';
                        else if (tempChar == 'O') tempChar = 'U';
                        else if (tempChar == 'U') {
                            isUp = true;
                            continue;
                        }
                    }
                    t = tempChar + t;
                }
                temp = t;
            }
            if (str.equals(temp)) break;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}