import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1074
 * BOJ 백준온라인져지 1074 Z 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int r, c;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf((int) Z(0, 0, N)));
        bw.flush();
    }
    private static double Z (double x, double y, double z) throws IOException {
        if (z == 0) return 0;
        double tempZ = Math.pow(2, z - 1);
        z--;
        if (c < y + tempZ) { // 0 2
            if (r < x + tempZ) return Z(x, y, z);
            return Z(x + tempZ, y, z) + tempZ * tempZ * 2;
        } else { // 1 3
            if (r < x + tempZ) return Z(x, y + tempZ, z) + tempZ * tempZ;
            return Z(x + tempZ, y + tempZ, z) + tempZ * tempZ * 3;
        }
    }
}
