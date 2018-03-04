import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9375
 * BOJ 백준온라인져지 9375 패션왕 신혜빈 풀이
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testcase = Integer.parseInt(br.readLine());

        while (testcase-- > 0) {
            HashMap<String, Integer> hmap = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                String type = br.readLine().split(" ")[1];
                Integer value = hmap.get(type);
                if (value == null) value = 1;
                else value++;
                hmap.put(type, value);
            }
            int result = 1;
            for (int v : hmap.values()) {
                result *= v + 1;
            }
            bw.write((result - 1) + "\n");
        }

        bw.flush();
    }
}