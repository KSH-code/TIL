import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine().toUpperCase();
        int check[] = new int[26];
        int idx = 0;
        int max = 0;
        boolean what = false;
        for (int i = 0; S.length() > i; i++) {
            check[((int) S.charAt(i)) - 65]++;
        }
        for (int i = 0; i < check.length; i++) {
            if (check[i] > max) {
                what = false;
                idx = i;
                max = check[i];
            } else if (check[i] == max) {
                what = true;
            }
        }
        if (what) {
            bw.write('?');
        } else {
            bw.write(((char) idx + 65));
        }
        bw.flush();
    }
}