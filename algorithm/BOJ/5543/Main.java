import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5543
 * BOJ 백준온라인져지 5543 상근날드 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int burger = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) burger = Math.min(burger, Integer.parseInt(br.readLine()));
        int drink = Integer.MAX_VALUE;
        for (int i = 0; i < 2; i++) drink = Math.min(drink, Integer.parseInt(br.readLine()));
        bw.write(String.valueOf(burger + drink - 50));
        bw.flush();
    }
}
