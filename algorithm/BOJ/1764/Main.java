import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1764
 * BOJ 백준온라인져지 1764 듣보잡 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String listen[] = new String[N];
        for (int i = 0; i < N; i++) listen[i] = br.readLine();
        Arrays.sort(listen);
        LinkedList<String> listenAndSee = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            String see = br.readLine();
            int l = 0;
            int r = N - 1;
            while (l <= r) {
                int m = (l + r) / 2;
                int result = listen[m].compareTo(see);
                if (result == 0) {
                    listenAndSee.add(see);
                    break;
                } else if (result < 0) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        Collections.sort(listenAndSee);
        bw.write(String.valueOf(listenAndSee.size()));
        for (String s : listenAndSee) {
            bw.write("\n");
            bw.write(s);
        }
        bw.flush();
    }
}
