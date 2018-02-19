import java.util.*;
import java.io.*;
/**
 *  BOJ https://www.acmicpc.net/problem/2042 구간 합 구하기
 *  https://gist.github.com/KSH-code/ca97b2ae1995e8746090b0817989d3c3
 */
class Main{
    private static int value[];
    private static long node[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1[] = br.readLine().split(" ");

        int N = Integer.parseInt(str1[0]); // 총 갯수
        int M = 0; // 연산할 갯수
        M += Integer.parseInt(str1[1]) + Integer.parseInt(str1[2]);

        int H = (int) Math.pow(2.0, Math.floor((Math.log(N) / Math.log(2.0)) + 1));
        value = new int[N];
        node = new long[2 * H];

        for(int i = 0; i<N; i++){
            value[i] = Integer.parseInt(br.readLine());
        }
        
        init(1, 0, N-1);

        for(int i = 0; i<M; i++){
            String str2[] = br.readLine().split(" ");
            int a = Integer.parseInt(str2[0]);
            int b = Integer.parseInt(str2[1]);
            int c = Integer.parseInt(str2[2]);

            if(a == 1){
                long diff = c-value[--b];
                value[b] = c;
                update(1, 0, N-1, b, diff);
            }else{
                bw.write(sum(1, 0, N-1, b-1, c-1)+"\n");
            }
        }
        bw.flush();
    }

    private static long init(int idx, int start, int end){
        if (start == end) {
            return node[idx] = value[start];
        } else {
            return node[idx] = init(idx*2, start, (start+end)/2) + init(idx*2+1, (start+end)/2+1, end);
        }
    }
    private static long sum(int idx, int start, int end, int left, int right){
        if (left > end || right < start) {
            return 0;
        }
        if(left <= start && right >= end){
            return node[idx];
        }
        return sum(idx*2, start, (start+end)/2, left, right) + sum(idx*2+1, (start+end)/2+1, end, left, right);
    }
    private static void update(int idx, int start, int end, int change, long diff){
        if (change < start || change > end) return;
        node[idx] = node[idx] + diff;
        if (start != end) {
            update(idx*2, start, (start+end)/2, change, diff);
            update(idx*2+1, (start+end)/2+1, end, change, diff);
        }
    }
}