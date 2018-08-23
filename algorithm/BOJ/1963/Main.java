import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1963
 * BOJ 백준온라인져지 1963 소수 경로 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        boolean isPrimeNumber[] = new boolean[10000];
        for (int i = 2; i < 10000; i++) isPrimeNumber[i] = true;
        for (int i = 2; i < 10000; i++) {
            if (isPrimeNumber[i]) {
                for (int j = i * i; j < 10000; j += i) isPrimeNumber[j] = false;
            }
        }
        while (testcase-- > 0) {
            boolean isVisited[] = new boolean[10000];
            Queue<Integer> q = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            q.offer(Integer.parseInt(st.nextToken()));
            int e = Integer.parseInt(st.nextToken());
            while (!q.isEmpty()) {
                int s = q.peek() % 10000;
                if (s == e) {
                    bw.write(String.valueOf(q.peek() / 10000));
                    break;
                }
                int cnt = q.poll() / 10000;
                isVisited[s] = true;
                for (int i = 3; i >= 0; i--) {
                    for (int j = 0; j <= 9; j++) {
                        int tempS = s;
                        int f = (int) Math.pow(10, i);
                        tempS -= tempS / f % 10 * f;
                        tempS += f * j;
                        if (tempS >= 1000 && tempS <= 9999 && !isVisited[tempS] && isPrimeNumber[tempS]) q.offer(tempS + 10000 * (cnt + 1));
                    }
                }
            }
            if (q.size() == 0) {
                bw.write("Impossible");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
