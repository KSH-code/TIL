import java.util.*;
import java.io.*;
import java.math.BigInteger;
/**
 * https://www.acmicpc.net/problem/13277
 * BOJ 백준온라인져지 13277 큰 수 곱셈 풀이
 */
class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");
        BigInteger A = new BigInteger(str1[0]);
        BigInteger B = new BigInteger(str1[1]);

        
        bw.write((A.multiply(B)) + "");
        bw.flush();
    }
}