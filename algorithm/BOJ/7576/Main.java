import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static int N;
    private static int M;

    private static int result = 0;

    private static boolean isZero = true;

    /**
     * 블로그들 참고해서 다음과 같은 방법을 알아냄
     */
    static int dx[]={0,0,1,-1};
    static int dy[]={1,-1,0,0};

    public static void main(String[] args) throws IOException{

        String str1[] = br.readLine().split(" ");
        N = Integer.parseInt(str1[0]);
        M = Integer.parseInt(str1[1]);
        int tomato[][] = new int[M][N];



        for(int i = 0; i<M; i++){
            String str2[] = br.readLine().split(" ");
            for(int j = 0; j<N; j++){
                tomato[i][j] = Integer.parseInt(str2[j]);
            }
        }


        BFS(tomato);
        temp:
        for(int i = 0; i<M; i++) for(int j = 0; j<N; j++) if(tomato[i][j] == 0){result = -1; break temp;}
        System.out.println(result);
    } 
    private static void BFS(int tomato[][]){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<M; i++) for(int j = 0; j<N; j++) if(tomato[i][j] == 1) q.offer(i * 10000 + j);
        while(!q.isEmpty()){ 
            int temp = q.poll();
            int x = temp / 10000, y = temp % 10000;
            for(int i=0;i<4;i++){
                int cx=x+dx[i];
                int cy=y+dy[i];
                if(isPossible(cx, cy) && tomato[cx][cy]==0){
                    tomato[cx][cy] = tomato[x][y]+1;
                    result=tomato[x][y];
                    q.offer(cx * 10000 + cy);
                }
            }
        }
        
    }

    private static boolean isPossible(int x, int y){
        return x >= 0 && y >= 0 && x < M && y < N;
    }

}