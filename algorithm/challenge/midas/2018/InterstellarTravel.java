import java.util.*;
import java.io.*;

public class InterstellarTravel {
    private static int d[][] = new int[26][26];
    public static void main( String argv[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str1[] = br.readLine().split(",");
            int start = str1[0].charAt(0) - 'A';
            int end = str1[1].charAt(0) - 'A';
            d[start][end] = 1;
        }
        int middle = br.readLine().charAt(0) - 'A';
        int result = dijkstra(0, middle) + dijkstra(middle, 25);
        result = result >= INF ? -1 : result;
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static final int INF = 214124142;
    private static int dijkstra (int start, int end) {
        int distance[] = new int[26];
        boolean visited[] = new boolean[26];
        for (int i = 0; i < 26; i++) distance[i] = INF;
        distance[start] = 0;
        visited[start] = true;
        for (int i = 0; i < 26; i++) {
            if (!visited[i] && d[start][i] != 0) distance[i] = 1;
        }
        for (int i = 0; i < 26; i++) {
            int min = INF;
            int idx = -1;
            for (int j = 0; j < 26; j++) {
                if (min > distance[j] && !visited[j]) {
                    idx = j;
                    min = distance[j];
                }
            }
            if (idx == -1) break;
            visited[idx] = true;
            for (int j = 0; j < 26; j++) {
                if (!visited[j] && d[idx][j] != 0) {
                    distance[j] = Math.min(distance[j], distance[idx] + d[idx][j]);
                }
            }
        }
        return distance[end];
    }
}
