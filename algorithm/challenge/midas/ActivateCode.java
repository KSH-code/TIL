import java.util.*;
import java.io.*;

public class ActivateCode {
    public static void main( String argv[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String serialNumber = String.valueOf(Long.toBinaryString(Long.parseLong(br.readLine())));
        String token = String.valueOf(Long.toBinaryString(Long.parseLong(br.readLine())));
        bw.write(String.valueOf(f(serialNumber, token)));
        bw.flush();
    }
    private static int f (String serialNumber, String token) {
        int remainLength = serialNumber.length();
        for (int i = 0; i < serialNumber.length() - token.length(); i++) {
            String temp = serialNumber;
            boolean check = true;
            for (int j = 0; j < token.length(); j++) {
                if (token.charAt(j) != temp.charAt(i + j)) {
                    check = false;
                    break;
                }
            }
            if (check) remainLength = Math.min(remainLength, f(serialNumber.substring(0, i) + serialNumber.substring(i + token.length(), serialNumber.length()), token));
        }
        return remainLength;
    }
}
