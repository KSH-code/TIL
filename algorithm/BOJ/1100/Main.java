import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        int check = 0;
        for(int i = 0;i<8;i++){
            check=i%2;
            result+=isF(br.readLine(), check, 0);
        }
        bw.write(String.valueOf(result));
        bw.flush();

    }
    private static int isF(String str, int idx, int result){
        if(idx>7)
            return result;
        if(str.charAt(idx)=='F')
            return isF(str, idx+2, result+1);
        return isF(str, idx+2, result);
    }
}