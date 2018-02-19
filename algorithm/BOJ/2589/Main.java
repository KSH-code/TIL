import java.io.*;
import java.util.*;

/**
 * BOJ 2589 보물섬
 * https://gist.github.com/KSH-code/ceff9760ed82ffd647570dae9349a4da
 */
public class Main{
    private static int N,M;
    private static int result = 0;
    private static int go[] = {-1, -1, 1, 1};
    private static boolean map[][];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        N = Integer.parseInt(str1[0]);
        M = Integer.parseInt(str1[1]);

        map = new boolean[N][M];
        for(int i = 0; i<N; i++){
            String str2[] = br.readLine().split("");
            for(int j = 0; j<M; j++){
                map[i][j] = str2[j].equals("L");
            }
        }
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                if(map[i][j]){
                    BFS(i, j);
                }
            }
        }
        System.out.println(result);

    }
    private static void BFS(int x, int y){
        boolean visited[][] = new boolean[N][M];
        int time[][] = new int[N][M];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x*100+y);
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int poll = queue.poll();
            int tempX = poll / 100;
            int tempY = poll % 100;
            for(int i = 0; i<4; i++){
                int s = tempX;
                int e = tempY;

                if(i % 2 == 0){
                    s += go[i];
                }else{
                    e += go[i];
                }

                if(s < 0 || s >= N || e < 0 || e >= M || visited[s][e] || !map[s][e]) continue;

                visited[s][e] = true;
                time[s][e] = time[tempX][tempY] + 1;
                queue.offer(s * 100 + e);
                
                result = Math.max(result, time[s][e]);
            }
        }
    }
}