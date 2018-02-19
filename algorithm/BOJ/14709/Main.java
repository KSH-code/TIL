import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean f[][] = new boolean[6][6];
        int from,to;
        String str1[];
        for(int i = 0;i<N;i++){
            str1=br.readLine().split(" ");
            from=Integer.parseInt(str1[0]);
            to=Integer.parseInt(str1[1]);
            f[from][to] = true;
            f[to][from] = true;
            if(from==5||from==2||to==5||to==2){
                System.out.println("Woof-meow-tweet-squeek");
                return;
            }
        }
        if(f[1][3]&&f[1][4]&&f[3][4]){
            System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
        }else{
            System.out.println("Woof-meow-tweet-squeek");
            return;
        }
    }
}