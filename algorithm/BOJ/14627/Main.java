import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/14627
 * BOJ 백준온라인져지 14627 파닭파닭 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int S = Integer.parseInt(str1[0]);
        int C = Integer.parseInt(str1[1]);
        int arr[] = new int[S];
        for (int i = 0; i < S; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int l = 1;
        int r = arr[S - 1];
        long result = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            long tempSum = 0;
            int tempC = C;
            for (int i = 0; i < S; i++) {
                tempC -= arr[i] / mid;
                tempSum += arr[i] % mid;
            }
            if (tempC <= 0) {
                l = mid + 1;
                result = tempSum + (-tempC) * mid;
            } else r = mid - 1;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}