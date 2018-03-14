import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9506
 * BOJ 백준온라인져지 9506 약수들의 합 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1, temp = N / 2 + 1; i <= temp; i++) {
                if (N % i == 0) {
                    list.add(i);
                }
            }
            String str = "";
            int tempN = N;
            for (int i = 0, size = list.size(); i < size; i++) {
                int n = list.get(i);
                tempN -= n;
                str += n;
                if (i + 1 < size) {
                    str += " + ";
                }
            }
            bw.write(N + " ");
            if (tempN == 0) bw.write("= " + str);
            else bw.write("is NOT perfect.");
            bw.write("\n");
        }
        bw.flush();
    }
}