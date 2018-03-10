import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2668
 * BOJ 백준온라인져지 2668 숫자고르기 풀이
 */
public class Main {
    private static int arr[];
    private static boolean visited[];
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            if (DFS(i, i)) {
                if (list.contains(i)) {
                    continue;
                }
                list.add(i);
                int next = arr[i];
                while (next != i) {
                    list.add(next);
                    next = arr[next];
                }
            }
        }
        bw.write(list.size() + "\n");
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
    }
    
    private static boolean DFS (int x, int startX) {
        if (visited[x]) return false;
        visited[x] = true;
        if (arr[x] == startX) {
            return true;
        } else {
            return DFS(arr[x], startX);
        }
    }
}