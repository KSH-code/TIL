import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[];
        try{
            while(true){
                str1 = br.readLine().split(" ");
                bw.write(String.valueOf(Integer.parseInt(str1[0])+Integer.parseInt(str1[1])));
                bw.write("\n");
            }
        }catch(Exception e){

        }
        bw.flush();
    }
}
