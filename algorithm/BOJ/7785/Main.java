import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/7785
 * BOJ 백준온라인져지 7785 회사에 있는 사람 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> nameSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String str1[] = br.readLine().split(" ");
            String name = str1[0];
            boolean isLeave = str1[1].equals("leave");
            if (!isLeave) nameSet.add(name);
            else nameSet.remove(name);
        }
        String nameArray[] = nameSet.toArray(new String[nameSet.size()]);
        Arrays.sort(nameArray);
        for (int i = nameArray.length - 1; i >= 0; i--) {
            bw.write(nameArray[i] + "\n");
        }
        bw.flush();
    }
}