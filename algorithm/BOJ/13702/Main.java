import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/13702
 * BOJ 백준온라인져지 13702 이상한 술집 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int NK[] = new int[2];
        int i = 0;
        while (st.hasMoreTokens()) {
            NK[i++] = Integer.parseInt(st.nextToken());
        }
        int arr[] = new int[NK[0]];
        for (i = 0; i < NK[0]; i++) { 
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long l = 0;
        long r = arr[NK[0] - 1];
        long mid = 0;
        while (l < r) {
            mid = (l + r) / 2;
            int K = 0;
            for (i = 0; i < NK[0]; i++) {
                K += arr[i] / mid;
            }
            if (K < NK[1]) r = mid;
            else l = mid + 1;
        }
        bw.write(String.valueOf(r - 1));
        bw.flush();
    }
}