import java.io.*;
import java.util.*;

/**
 * BOJ 1717 집합의 표현
 * https://gist.github.com/KSH-code/bb159f20bca5b9435caa351f650a5126
 */
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1[] = br.readLine().split(" ");
        int n = Integer.parseInt(str1[0]), m = Integer.parseInt(str1[1]);

        int disjoint[] = new int[n+1];

        for(int i = 0; i<=n; i++){
            disjoint[i] = i;
        }

        for(int i = 0; i<m; i++){
            String str2[] = br.readLine().split(" ");
            int a = Integer.parseInt(str2[0]), b = Integer.parseInt(str2[1]), c = Integer.parseInt(str2[2]);
            if(a == 0){
                // c 의 부모를 b의 부모로 한다.
                link(disjoint, b, c);
            }else{
                // c의 부모와 b의 부모가 맞다면
                if(find(disjoint, b) == find(disjoint, c))
                    bw.write("YES");
                else
                    bw.write("NO");
                bw.write("\n");
            }
        }

        bw.flush();

    }
    /**
     *  트리 구조이기 때문에 루트를 변겅하면 그 밑에것들은 알아서 따라오게 된다.
     */
    private static void link(int dis[], int x, int y){
        dis[find(dis, y)] = find(dis, x);
    }
    /**
     *  트리 구조에서 루트를 찾기위해 재귀함수를 이용한다.
     */
    private static int find(int dis[], int x){
        if(dis[x] == x) return x;
        else return dis[x] = find(dis, dis[x]);
    }
}