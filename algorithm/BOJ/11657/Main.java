import java.io.*;
import java.util.*;

/**
 * BOJ 11657 타임머신
 * https://gist.github.com/KSH-code/db82f6fce9c81d50ce203417a159206a
 */
class Bus{
    public int s, e ,w;
    public Bus(int s, int e, int w) {
        this.s = s;
        this.e = e;
        this.w = w;
    }
}
public class Main{
    private static final int MAX = 124124124;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1[] = br.readLine().split(" ");

        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        
        Bus bus[] = new Bus[M];
        int dist[] = new int[N+1];
        Arrays.fill(dist, MAX);
        dist[1] = 0;
        for(int i = 0; i<M; i++){
            String str2[] = br.readLine().split(" ");
            int u = Integer.parseInt(str2[0]);
            int v = Integer.parseInt(str2[1]);
            int w = Integer.parseInt(str2[2]);
            bus[i] = new Bus(u, v, w);
        }
        if(BellmanFord(dist, bus, N, M)){
            for (int i = 2; i <=N; i++){
                System.out.println(dist[i] == MAX ? -1 : dist[i]);
            }
        }else{
            System.out.println(-1);
        }
    }
    private static boolean BellmanFord(int dist[], Bus bus[], int N, int M){
        for(int i = 1; i<=N; i++){
            for(int j = 0; j<M; j++){
                if(dist[bus[j].e] > bus[j].w + dist[bus[j].s]){
                    dist[bus[j].e] = bus[j].w + dist[bus[j].s];
                }
            }
        }        
        for (int i = 0; i<M; i++) 
            if(dist[bus[i].e] > bus[i].w + dist[bus[i].s])
                return false;
        return true;
    }
}