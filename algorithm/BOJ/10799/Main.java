
import java.io.*;
import java.util.*;
/**
 *  BOJ 10799 쇠막대기
 *  https://gist.github.com/KSH-code/b0231402085af2e33261bd0921ae82b8
 */
public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char str1[] = br.readLine().toCharArray();
        int snwjr = 0;
        int result = 0;
        for(int i = 0; i<str1.length - 1; i++){
            if(str1[i] == '(' && str1[i+1] == ')'){
                result += snwjr;
            }else if(str1[i] == '(' && str1[i+1] == '('){
                snwjr++;
            }else if(str1[i] == ')' && str1[i+1] == ')'){
                result++;
                --snwjr;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    
}