import java.io.*;
import java.util.*;


class Node implements Comparable<Node>{

    public int V,W;

    public Node(int V, int W){
        this.V = V; // U -> V 할때 V
        this.W = W; // U -> V 의 가중치
    }

    @Override
    public int compareTo(Node arg0) { 
        return this.W - arg0.W; // 오름차순 정렬
    }
}
/**
 * BOJ 1753 최단경로
 * https://gist.github.com/KSH-code/67fb87884e03b0144db3b4387c05e85d
 */
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Node 개수와 엣지 개수를 입력받음
        String str1[] = br.readLine().split(" ");
        int V = Integer.parseInt(str1[0]);
        int E = Integer.parseInt(str1[1]);

        PriorityQueue<Node> edges[] = new PriorityQueue[V+1];
        Queue<Integer> tempQueue = new LinkedList<>();
        for(int i = 1; i<=V; i++)
            edges[i] = new PriorityQueue<>();
        
        // 시작 정점 입력받고, 가중치 배열 생성
        int K = Integer.parseInt(br.readLine());
        int W[] = new int[V+1];
        Arrays.fill(W, 9898798);
        W[K] = 0;
        // 시작정점 담아준다.

        for(int i = 0; i<E; i++){

            String str2[] = br.readLine().split(" ");
            int u = Integer.parseInt(str2[0]);
            int v = Integer.parseInt(str2[1]);
            int w = Integer.parseInt(str2[2]);

            edges[u].offer(new Node(v, w));
        }
        
        tempQueue.offer(K);        
        

        while(!tempQueue.isEmpty()){
            int s = tempQueue.poll(); // 시작
            Iterator it = edges[s].iterator();
            while(it.hasNext()){ 
                Node tempNode = (Node) it.next();
                if (W[tempNode.V] > tempNode.W + W[s]) {
                    tempQueue.add(tempNode.V);
                }
                W[tempNode.V] = Math.min(tempNode.W + W[s], W[tempNode.V]);
            }
        }

        // 값 출력
        for(int i = 1; i<=V; i++){
            if(W[i] == 9898798)
                bw.write("INF");
            else
                bw.write(String.valueOf(W[i]));
            bw.write("\n");
        }

        bw.flush();

    }
}