import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2437
 * BOJ 백준온라인져지 2437 저울 풀이
 */
public class Main {
    private static int arr[];
    private static void quickSort (int l, int r) {
        int i = l;
        int j = r;
        int pivot = arr[(i + j) / 2];
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (l < j) quickSort(l, j);
        if (i < r) quickSort(i, r);
    }
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        String str1[] = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str1[i]);
        }
        quickSort(0, N - 1);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (sum + 1 < arr[i]) {
                break;
            }
            sum += arr[i];
        }
        bw.write(String.valueOf(sum + 1));
        bw.flush();
    }
}