import java.util.*;
import java.io.*;
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int cost = 0, K, items[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        items = new int[6][];
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken());
            items[i] = new int[length];
            for (int j = 0; j < length; j++) {
                items[i][j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(items[i]);
        }
        K = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(dfs(0)));
        bw.flush();
    }
    private static int dfs (int x) {
        int l = 0;
        int r = items[x].length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (items[x][mid] + cost < K) l = mid + 1;
            else r = mid - 1;
        }
        if (x == 5) {
            return r + 1;
        }
        int result = 0;
        for (int i = r; i >= 0; i--) {
            cost += items[x][i];
            result += dfs(x + 1);
            cost -= items[x][i];
        }
        return result;
    }
}