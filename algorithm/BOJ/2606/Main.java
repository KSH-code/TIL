import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        boolean edges[][] = new boolean[N + 1][N + 1];
        boolean check[] = new boolean[N + 1];
        int length = Integer.parseInt(br.readLine());
        int sum = -1;
        for(int i = 0; i<length; i++){
            String str1[] = br.readLine().split(" ");
            edges[Integer.parseInt(str1[0])][Integer.parseInt(str1[1])] = true;
            edges[Integer.parseInt(str1[1])][Integer.parseInt(str1[0])] = true;
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        check[1] = true;
        while(!q.isEmpty()){
            int here = q.poll();
            sum++;
            for(int i = 1; i<=N; i++){
                if(check[i] || !edges[here][i]) continue;
                q.offer(i);
                check[i] = true;
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }

}