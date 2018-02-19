import java.util.*;
import java.io.*;
/**
 * https://www.acmicpc.net/problem/5525
 * BOJ 백준온라인져지 5525 IOIOI 풀이
 * 이슈 : StringBuilder를 사용하지 않으면 시간초과가 난다.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int pi[];
    private static int N,M;
    private static String str;
    static{
        try{
            N = lineToInt();
            M = lineToInt();
            str = br.readLine();
        }catch(Exception e){
            
        }
    }
    public static void main(String args[]) {
        StringBuilder s = new StringBuilder("I");
        for(int i = 0; i<N; i++){
            s.append("OI");
        }
        initPi(s.toString());
        System.out.println(KMP(s.toString()));
    }
    private static void initPi(String str){
        char[] temp = str.toCharArray();
        pi = new int[M];
        int j = 0;
        for(int i = 1; i<temp.length; i++){
            while (j > 0 && temp[i] != temp[j]) {
                j = pi[j-1];
            }
            if(temp[i] == temp[j]){
                pi[i] = ++j;
            }
        }
    }
    private static int KMP(String s){
        int cnt = 0, j = 0;
        char A[] = str.toCharArray(), B[] = s.toCharArray();
        for(int i = 0; i<M; i++){
            while (j > 0 && A[i] != B[j]){
                j = pi[j-1];
            }
            if (A[i] == B[j]){
                if (j == B.length-1){
                    j = pi[j];
                    cnt++;
                }else{
                    j++;
                }
            }
        }
        return cnt;
    }
    private static int lineToInt() throws IOException{
        return Integer.parseInt(br.readLine());
    }
}