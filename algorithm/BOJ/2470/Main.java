import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2470
 * BOJ 백준온라인져지 2470 두 용액 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int abs (int a) {
        return a < 0 ? -a : a;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(str1[i]));
        }
        Collections.sort(list);
        int min = list.get(0) + list.get(list.size() - 1);
        int l = 0;
        int r = list.size() - 1;
        int minIdx = l;
        int maxIdx = r;
        while (l < r) {
            int sum = list.get(l) + list.get(r);
            if (abs(sum) < abs(min)) {
                minIdx = l;
                maxIdx = r;
                min = sum;
            }
            if (sum < 0) l++;
            else r--;
        }
        bw.write(list.get(minIdx) + " " + list.get(maxIdx));
        bw.flush();
    }
}