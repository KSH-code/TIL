import java.util.*;
import java.io.*;
/**
 * BOJ 10800 컬러볼 풀이
 * https://gist.github.com/KSH-code/e705293348cbd1aea4567002e516a388
 */
class Ball implements Comparable<Ball>{
    public int color, weight, idx;
    public Ball(int color, int weight, int idx){
        this.color = color;
        this.weight = weight;
        this.idx = idx;
    }
    @Override
    public int compareTo(Ball arg){
        return this.weight - arg.weight;
    }
}
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int score[] = new int[N];
        int color[] = new int[N+1];
        int total = 0;
        Ball temp[] = new Ball[N];

        for(int i = 0; i<N; i++){
            String str1[] = br.readLine().split(" ");
            int c = Integer.parseInt(str1[0]);
            int w = Integer.parseInt(str1[1]);
            temp[i] = new Ball(c, w, i);
        }
        Arrays.sort(temp);
        
        for(int i = 0, j = 0; i<N; i++){
            for(; temp[j].weight<temp[i].weight; j++){
                total += temp[j].weight;
                color[temp[j].color] += temp[j].weight;
            }
            score[temp[i].idx] += total - color[temp[i].color];
        }
        for(int i = 0; i<N; i++){
            bw.write(score[i] + "\n");
        }
        bw.flush();
    }
}