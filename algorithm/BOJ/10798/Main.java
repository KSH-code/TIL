import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str[] = new String[5];
        for(int i = 0;i<5;i++)
            str[i] = br.readLine();
        for(int i = 0;i<15;i++){
            for(int j =0;j<5;j++){
                if(str[j].length()>i){
                    bw.write(str[j].charAt(i));
                }
            }
        }
        bw.flush();
    }
}
