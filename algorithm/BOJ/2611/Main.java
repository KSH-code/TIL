import java.io.*;
import java.util.*;

/**
 * BOJ 2611 자동차경주
 * https://gist.github.com/KSH-code/6ef723e29a1cffa75f4a429984047cd7
 */
class Edge{
    public int V,W;
    public Edge(int v, int w){
        V = v;
        W = w;
    }
}
public class Main{
    private static int V[];
    private static int MAX[];
    private static ArrayList<Edge> E[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        V = new int[N+1];
        E = new ArrayList[N+1];
        MAX = new int[N+1];
        for(int i = 1; i<=N; i++){
            E[i] = new ArrayList<>();
        }
        for(int i = 0; i<M; i++){
            String str1[] = br.readLine().split(" ");
            int s = Integer.parseInt(str1[0]);
            int e = Integer.parseInt(str1[1]);
            int w = Integer.parseInt(str1[2]);
            E[s].add(new Edge(e, w));
        }
        System.out.println(checkWeight(1, 0));
        printTree(1);
    }
    public static int checkWeight(int v, int w) {
        LinkedList<Edge> e = new LinkedList<>();
        int max = 0;
        int tempWeight = 0;
        if(MAX[v] > 0){
            max = MAX[v];
        }else if(E[v].size() > 0){
            for(int i = 0; i<E[v].size(); i++){
                e.add(E[v].get(i));
            }
            if(v == 1) E[v].clear();
            while(!e.isEmpty()){
                Edge temp = e.remove();
                tempWeight = checkWeight(temp.V, temp.W);
                if(tempWeight > max){
                    V[v] = temp.V;
                    max = tempWeight;
                }
            }
            MAX[v] = max;
        }
        return w + max;
    }
    private static void printTree(int i){
        if(V[i] == 1){
            System.out.print(i + " ");
            System.out.print(1);
        }else{
            System.out.print(i + " ");
            printTree(V[i]);
        }
    }
}