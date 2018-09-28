import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2857
 * BOJ 백준온라인져지 2857 FBI 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            String str = br.readLine();
            if (str.contains("FBI")) result.add(i);
        }
        if (result.size() > 0) {
            while (!result.isEmpty()) {
                bw.write(result.get(0) + " ");
                result.remove(0);
            }
        } else bw.write("HE GOT AWAY!");
        bw.flush();
    }
}