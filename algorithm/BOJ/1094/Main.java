import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1094
 * BOJ 백준온라인져지 1094 막대기 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int min = 64;
        int cur = min;
        int X = Integer.parseInt(br.readLine());
        int result = 1;
        while (cur != X) {
            min = min / 2;
            if (X <= cur - min) {
                cur -= min;
                result--;
            }
            result++;
        }
        bw.write(String.valueOf(result));
//         가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
// 만약, 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
        bw.flush();
    }
}