import java.util.*;
import java.io.*;
/**
 * BOJ 2188 축사 배정
 * https://gist.github.com/KSH-code/60dbb61d1af8979e396ca49dc97a3b14
 */
class Main {    
    private static boolean visited[];   
    private static int edges[][], N, M, B[];   
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str1[] = br.readLine().split(" ");
        N = Integer.parseInt(str1[0]);
        M = Integer.parseInt(str1[1]);
        edges = new int[N+1][M+1];
        visited = new boolean[N+1];
        B = new int[N+1];
        for(int i = 1; i<=N; i++){
            String str2[] = br.readLine().split(" ");
            int length = Integer.parseInt(str2[0]);
            Arrays.fill(edges[i], -1);
            for(int j = 1; j<=length; j++){
                edges[i][j] = Integer.parseInt(str2[j]);
            }
        }

        int result = 0;
        for(int i = 1; i<=N; i++){
            Arrays.fill(visited, false);
            if(dfs(i)) result++;
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static boolean dfs(int start){
        visited[start] = true;
        for(int i = 1; i<=M; i++){
            if(edges[start][i] == -1) break;
            int v = edges[start][i];
            if(B[v] == 0 || (!visited[B[v]] && dfs(B[v]))){
                B[v] = start;
                return true;
            }
        }
        return false;
    }
}