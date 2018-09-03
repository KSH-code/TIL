import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1205
 * BOJ 백준온라인져지 1205 등수 구하기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int newPoint = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int rank = 0;
        int curPoint = 2147483647;
        int ranker[] = new int[P + 1];
        int rankerPoint[] = new int[P + 1];
        for (int i = 1; i <= P; i++) rankerPoint[i] = -1;
        ranker[0] = 1;
        if (N > 0) st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int tempPoint = Integer.parseInt(st.nextToken());
            if (curPoint == tempPoint) {
                ranker[rank]++;
            } else {
                rank += ranker[rank];
                ranker[rank] = 1;
                rankerPoint[rank] = tempPoint;
            }
            curPoint = tempPoint;
        }
        int resultRank = -1;
        int tempP = P;
        for (int i = 1; i <= P; i++) {
            if (rankerPoint[i] == newPoint && tempP > ranker[i] || (rankerPoint[i] < newPoint && rankerPoint[i] > -1)) {
                resultRank = i;
                break;
            }
            tempP -= ranker[i];
            if (tempP <= 0) break;
        }
        if (tempP > 0 && resultRank == -1) resultRank = N + 1;
        bw.write(String.valueOf(resultRank));
        bw.flush();
    }
}