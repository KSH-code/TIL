import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2635
 * BOJ 백준온라인져지 2635 수 이어가기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = N; i >= N / 2; i--) {
            LinkedList<Integer> numberList = new LinkedList<>();
            numberList.add(N);
            int tempN = N;
            int number = i;
            while (true) {
                if (tempN < 0) break;
                int t = tempN;
                if (number >= 0) numberList.add(number);
                tempN = number;
                number = t - tempN;
            }
            if (max < numberList.size()) {
                max = numberList.size();
                result = numberList;
            }
        }
        bw.write(max + "\n");
        for (int n : result) bw.write(n + " ");
        bw.flush();
    }
}