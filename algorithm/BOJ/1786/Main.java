import java.util.*;
import java.io.*;
/**
 * https://www.acmicpc.net/problem/1786
 * BOJ 백준온라인져지 1786 찾기 풀이
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int pi[];
    private static int N,M;
    private static String str,pattern;
    static{
        try{
            str = br.readLine();
            pattern = br.readLine();
        }catch(Exception e){
            
        }
    }
    public static void main(String args[]) {
        initPi(pattern);
        LinkedList<Integer> list = KMP(pattern);
        System.out.println(list.size());
        for(int temp : list){
            System.out.println(temp);
        }
    }
    private static void initPi(String str){
        char[] temp = str.toCharArray();
        pi = new int[temp.length];
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
    private static LinkedList<Integer> KMP(String s){
        LinkedList<Integer> list = new LinkedList<>();
        int cnt = 0, j = 0;
        char A[] = str.toCharArray(), B[] = s.toCharArray();
        for(int i = 0, length = str.length(); i<length; i++){
            while (j > 0 && A[i] != B[j]){
                j = pi[j-1];
            }
            if (A[i] == B[j]){
                if (j == B.length-1){
                    j = pi[j];
                    list.add(i-B.length+2);
                }else{
                    j++;
                }
            }
        }
        return list;
    }
}