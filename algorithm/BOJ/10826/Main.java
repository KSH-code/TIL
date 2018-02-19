import java.util.*;
import java.io.*;
import java.math.BigInteger;
/**
 * https://www.acmicpc.net/problem/10826
 * BOJ 백준온라인져지 10826 피보나치 수 4 풀이
 */
class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        BigInteger fibonacci[] = new BigInteger[N + 3];
        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;
        for(int i = 2; i <= N; i++){
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }
        bw.write(fibonacci[N] + "");
        bw.flush();
    }
}