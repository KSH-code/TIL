import java.util.*;
import java.io.*;
/**
 * https://www.acmicpc.net/problem/1021
 * BOJ 백준온라인져지 1021 회전하는 큐 풀이
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        String str2[] = br.readLine().split(" ");
        int result = 0;
        for (int z = 0; z < M; z++) {
            int number = Integer.parseInt(str2[z]);
            while (true) {
                int idx = 0;
                Iterator<Integer> it = deque.iterator();
                while (it.hasNext()) {
                    if (it.next() == number) break;
                    idx++;
                }
                if (idx == 0) {
                    deque.pollFirst();
                    break;
                } else if (deque.size() / 2 >= idx) {
                    deque.addLast(deque.pollFirst());
                    result++;
                } else {
                    deque.addFirst(deque.pollLast());
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}