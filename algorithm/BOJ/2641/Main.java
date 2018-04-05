import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2641
 * BOJ 백준온라인져지 2641 다각형 풀이
 */
public class Main {
    private static String str1[];
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        str1 = br.readLine().split(" ");
        int K = Integer.parseInt(br.readLine());
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            String str = br.readLine();
            String str2[] = str.split(" ");
            for (int z = 0; z < N; z++) {
                if (isEqual(str2)) {
                    result.add(str);
                    break;
                } else {
                    String temp[] = new String[str2.length];
                    for (int j = 1; j < str2.length; j++) {
                        temp[j - 1] = str2[j];
                    }
                    temp[str2.length - 1] = str2[0];
                    str2 = temp;
                }
            }
            String temp1[] = new String[str2.length];
            for (int j = 0; j < str2.length; j++) {
                str2[j] = String.valueOf((Integer.parseInt(str2[j]) + 1) % 4 + 1);
                temp1[str2.length - j - 1] = str2[j];
            }
            str2 = temp1;
            for (int z = 0; z < N; z++) {
                if (isEqual(str2)) {
                    result.add(str);
                    break;
                } else {
                    String temp[] = new String[str2.length];
                    for (int j = 1; j < str2.length; j++) {
                        temp[j - 1] = str2[j];
                    }
                    temp[str2.length - 1] = str2[0];
                    str2 = temp;
                }
            }
        }
        bw.write(String.valueOf(result.size()));
        bw.write("\n");
        for (int i = 0; i < result.size(); i++) {
            bw.write(result.get(i));
            bw.write("\n");
        }
        bw.flush();
    }
    private static boolean isEqual (String str2[]) {
        for (int i = 0; i < str1.length; i++) {
            if (!str2[i].equals(str1[i])) return false;
        }
        return true;
    }
}
