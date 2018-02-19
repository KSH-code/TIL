import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s1[] = br.readLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);
        ArrayList<Integer> X = new ArrayList<>();
        String s2[];
        int query;
        int x;
        for(int i = 0;i<N;i++){
            X.add(1);
        }
        for(int i = 0;i<M;i++){
            s2 = br.readLine().split(" ");
            query = Integer.parseInt(s2[0]);
            x = Integer.parseInt(s2[1]);
            if(query==1){
                if(x<=N/2){
                    
                }else{

                }
            }else{
                bw.write(X[x-1]+"\n");
            }
        }
        bw.flush();
    }
}