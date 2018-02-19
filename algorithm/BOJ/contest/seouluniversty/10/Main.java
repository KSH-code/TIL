import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s1[] = br.readLine().trim().split(" ");
        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);
        int L = Integer.parseInt(s1[2]);

        int H[] = new int[N];
        int W[] = new int[M];
        String s2[] = br.readLine().trim().split(" ");
        String s3[] = br.readLine().trim().split(" ");
        long result[]=new long[L];

        for(int i = 0;i<s2.length;i++){
            H[i]=Integer.parseInt(s2[i]);
        }
        for(int i = 0;i<s3.length;i++){
            W[i]=Integer.parseInt(s3[i]);
        }

        long temp;
        int temp_w;
        int temp_h;
        long area=N*M;
        for(int i = 1;i<=L;i++){
            temp=i;
            while(temp<=area){
                if(s2.length==1){
                    temp_h=(int)temp-1;
                }else{
                    temp_h=(int)((temp-1)/s2.length);
                }
                if(s3.length==1){
                    temp_w=0;
                }else{
                    temp_w=(int)((temp-1)%s3.length);
                }
                result[i-1]+=W[temp_w]*H[temp_h];
                temp+=L;
            }
        }
        for(int i = 0;i<L;i++){
            bw.write(result[i]+"\n");
        }
        bw.flush();
    }
}