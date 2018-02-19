import java.io.*;
import java.util.*;

/**
 * BOJ 11404 플로이드
 * https://gist.github.com/KSH-code/59401b2835dbec0dd7c41dea37005269
 */
public class Main{
    private static final int MOD = (int)(1e+9)+7;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int V = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int d[][] = new int[V + 1][V + 1];
        for(int i = 1; i<=V; i++){
            Arrays.fill(d[i], Integer.MAX_VALUE);
            d[i][i] = 0;            
        }
        for (int i = 0; i<E; i++){
            String str1[] = br.readLine().split(" ");
            int a = Integer.parseInt(str1[0]);
            int b = Integer.parseInt(str1[1]);
            int c = Integer.parseInt(str1[2]);
            d[a][b] = Math.min(c, d[a][b]);
        }

        floyd(d, V);

        for(int i = 1; i<=V; i++){
            for(int j = 1; j<=V; j++){
                bw.write(d[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();

    }

    private static void floyd(int d[][], int V){
        for (int k = 1; k <= V; k++)
            for (int i = 1; i <= V; i++)
                for (int j = 1; j <= V; j++) {
                    if (d[i][k] == Integer.MAX_VALUE || d[k][j] == Integer.MAX_VALUE) continue;
                    if (d[i][j] > d[i][k] + d[k][j]){
                        d[i][j] = d[i][k] + d[k][j];
                    }
                }
    }
}