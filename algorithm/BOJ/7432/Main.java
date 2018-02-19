/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-09-10 12:24:49
 * @modify date 2017-09-10 12:24:49
 * @desc [https://www.acmicpc.net/problem/7432]
*/
import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        TreeMap<String,TreeMap<String,String>> tree = new TreeMap<>();
        String d[];
        for(int i=0;i<N;i++){
            d=br.readLine().split("\\");
            for(int j=0;j<d.length;j++){
                if(!tree.containsKey(d[0])){
                    tree.put(d[j], new TreeMap<String,String>());
                    for(int k=1;k<=j;k++){
                        
                    }
                }else{
                    
                }
            }
        }
        Collections.sort(tree);
    }
}