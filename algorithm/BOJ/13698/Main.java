import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/13698
 * BOJ 백준온라인져지 13698 Hawk eyes 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split("");
        int arr[] = new int[4];
        arr[0] = 1;
        arr[3] = 2;
        for (int i = 0; i < str1.length; i++) {
            int j = str1[i].charAt(0) - 'A';
            if (j == 0) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            } else if (j == 1) {
                int temp = arr[0];
                arr[0] = arr[2];
                arr[2] = temp;
            } else if (j == 2) {
                int temp = arr[0];
                arr[0] = arr[3];
                arr[3] = temp;
            } else if (j == 3) {
                int temp = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;
            } else if (j == 4) {
                int temp = arr[1];
                arr[1] = arr[3];
                arr[3] = temp;
            } else if (j == 5) {
                int temp = arr[2];
                arr[2] = arr[3];
                arr[3] = temp;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i] == 1) bw.write((i + 1) + "\n");
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i] == 2) bw.write((i + 1) + "\n");
        }
        bw.flush();
    }
}