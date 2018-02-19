import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        long result;
        long asdb;
        String nn[];
        int N;
        LinkedList<Long> temp=new LinkedList<>();
            for(int t=0;t<T;t++){ 
            N = Integer.parseInt(br.readLine());
            nn = br.readLine().split(" ");
            result = 1;
            temp.clear();
            for(int i = 0;i<N;i++)
                temp.add(Long.parseLong(nn[i]));
            while(temp.size()>1){
                Collections.sort(temp);
                asdb=temp.removeFirst()*temp.removeFirst();
                asdb%=1000000007;
                result=result*asdb;
                result%=1000000007;
                temp.add(asdb);
            }
            bw.write(result+"\n");
        }
        bw.flush();
    }
}
//1000000007