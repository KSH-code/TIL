import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15565
 * BOJ 백준온라인져지 15565 귀여운 라이언 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);

        String str2[] = br.readLine().split(" ");
        int min = Integer.MAX_VALUE;
        int check = 0;
        int tempResult = 0;
        int first = -1;
        for (int i = 0; i < N; i++) {
            if (first >= 0) tempResult++;
            if (str2[i].equals("1")) {
                if (first == -1) {
                    first = i;
                    tempResult++;
                }
                check++;
                if (check == K) {
                    if (min > tempResult) min = tempResult;
                    while (first < i) {
                        tempResult--;
                        first++;
                        if (str2[first].equals("1")) break;
                    }
                    check--;
                }
            }
        }
        bw.write(String.valueOf(min == Integer.MAX_VALUE ? -1 : min));
        bw.flush();
    }
}