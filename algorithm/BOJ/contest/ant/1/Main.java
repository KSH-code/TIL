import java.io.*;
import java.util.*;
class Main{
        private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        private static boolean MN[][];
        private static int M,N;
        private static int result=0;
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        M = Integer.parseInt(str1[0]);
        N = Integer.parseInt(str1[1]);
        String str2[];
        MN = new boolean[M][N];
        for(int i = 0;i<M;i++){
            str2 = br.readLine().split(" ");
            for(int j = 0;j<N;j++)
                MN[i][j] = Integer.parseInt(str2[j]) == 1;
        }
        for(int i = 0;i<M;i++){
            for(int j = 0;j<N;j++){
                result += check(i,j)?1:0;
            }
        }
        check(0,0);        
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static boolean check(int x, int y){
        if(MN[x][y]){
            MN[x][y] = false;
            if(x-1>=0){
                if(MN[x-1][y]){
                    check(x-1,y);
                }
                if(y-1>=0){
                    if(MN[x-1][y-1]){
                        check(x-1,y-1);
                    }
                }
                if(y+1<N){
                    if(MN[x-1][y+1]){
                        check(x-1,y+1);
                    }
                }
            }
            if(y+1<N){
                if(MN[x][y+1]){
                    check(x,y+1);
                }
                if(x+1<M){
                    if(MN[x+1][y+1]){
                        check(x+1,y+1);
                    }
                }
            }
            if(x+1<M){
                if(MN[x+1][y]){
                    check(x+1,y);
                }
                if(y-1>=0){
                    if(MN[x+1][y-1]){
                        check(x+1,y-1);
                    }
                }
            }
            if(y-1>=0){
                if(MN[x][y-1]){
                    check(x,y-1);
                }
            }
            return true;
        }else{
            return false;
        }
    }
}