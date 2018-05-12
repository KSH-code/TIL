import java.util.*;
import java.io.*;

public class SafeUserInfo {
    public static void main( String argv[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String id = br.readLine();
        String pw = br.readLine();
        if (id.length() < 6 || id.length() > 12) {
            System.out.println("F");
            return;
        }
        if (pw.length() < 8 || pw.length() > 16) {
            System.out.println("F");
            return;
        }
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                System.out.println("F");
                return;
            }
        }
        int cnt = 1;
        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);
            if (i != 0 && pw.charAt(i - 1) == c) {
                cnt++;
            } else cnt = 1;
            if (cnt == 3 || !((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                System.out.println("F");
                return;
            }
        }
        bw.write("T");
        bw.flush();
    }
}
