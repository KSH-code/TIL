import java.io.*;
import java.util.*;

/**
 * BOJ 2610 회의준비
 * 
 */
public class Main{
    private static int MAX = 12341234;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        int dist[][] = new int[N+1][N+1];
        for(int i = 1; i<=N; i++)
            for(int j = 1; j<=N; j++)
                if(i == j) dist[i][j] = 0;
                else dist[i][j] = MAX;

        for(int i = 1; i<=E; i++){
            String str1[] = br.readLine().split(" ");
            int s = Integer.parseInt(str1[0]);
            int e = Integer.parseInt(str1[1]);
            dist[e][s] = dist[s][e] = 1;
        }
        floyd(dist, N);
        /**
         * 묶여있는 것들 분리
         * 그러면서 가중치도 넣어준다.
         */
        int parent[] = new int[N+1]; // 그루핑 disjoint set
        int max[] = new int[N + 1]; // 최대값을 넣어주기 위한 배열
        for(int i = 1; i<=N; i++){
            int temp = 0;
            for(int j = 1; j<=N; j++){
                if(dist[i][j] != MAX){
                    if(temp < dist[i][j]){
                        temp = dist[i][j];
                    }
                    if(dist[i][j] > 0 && parent[j] == 0){
                        parent[j] = i;                         
                    }
                }
                if(dist[i][j] == 0 && parent[i] == 0){
                    parent[i] = i;
                }
            }
            max[i] = temp;
        }
        /**
         * 묶여있는 것들끼리 작은값을 계산
         */
        int result[] = new int[N + 1];
        boolean check[] = new boolean[N+1];
        for(int i = 1; i<=N; i++){
            if(check[parent[i]]) // 그루핑 돼있으면 스킵
                continue;
            for(int j = 1; j<=N; j++){
                if(parent[i] == parent[j] && !check[parent[i]]){ // 그루핑이 돼지않고, 루트가 같으면
                    if(result[parent[j]] == 0) {
                        result[parent[j]] = j;
                    }else{
                        if(max[result[parent[j]]] > max[j]){ // max값을 체크해서 더 낮으면
                            result[parent[j]] = j; // 인덱스 저장
                        }
                    }
                }
            }
            check[parent[i]] = true; // 그루핑 완료
        }
        /**
         * 위원장들을 담고 정렬한다.
         */
        LinkedList<Integer> fuck = new LinkedList<>();
        for(int i = 1; i<=N; i++){
            if(result[i] != 0){
                fuck.add(result[i]);
            }
        }
        Collections.sort(fuck);
        System.out.println(fuck.size());
        while(!fuck.isEmpty())
            System.out.println(fuck.remove());
    }
    private static void floyd(int dist[][], int N){
        for(int k = 1; k<= N; k++)
            for(int i = 1; i<=N; i++)
                for(int j = 1; j<=N; j++){
                    if(dist[i][j] > dist[i][k] + dist[k][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
    }
}