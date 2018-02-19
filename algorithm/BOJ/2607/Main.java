import java.io.*;
import java.util.*;

/**
 * BOJ 2607 비슷한 단어
 * https://gist.github.com/KSH-code/869cb5067dd8896afe316b48c0a61845
 */
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str1[] = new String[N];
        int sum = 0;
        for(int i = 0; i<N; i++)
            str1[i] = br.readLine();
        for(int j = 1; j<N; j++){
            String a = str1[0];
            String b = str1[j];
            if(a.length() <  b.length()){
                String temp = a;
                a = b;
                b = temp;
            }
            char aa[] = a.toCharArray();
            char bb[] = b.toCharArray();
            int fuck = aa.length;
            for(int ii = 0; ii<aa.length; ii++){
                for(int jj = 0; jj<bb.length; jj++){
                    if(aa[ii] == bb[jj]){
                        fuck--;
                        bb[jj] = ' ';
                        break;
                    }
                }
            }
            if(fuck <= 1){
                sum++;
            }
        }
        System.out.println(sum);
    }
}