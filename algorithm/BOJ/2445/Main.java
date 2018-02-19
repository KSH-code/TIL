/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-09-10 11:59:29
 * @modify date 2017-09-10 11:59:29
 * @desc [https://www.acmicpc.net/problem/2445]
*/
import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1;i<N;i++){
            writeStar(i, bw);
            for(int j=N;j>i;j--){
                bw.write("  ");
            }
            writeStar(i, bw);
            bw.write("\n");
        }
        writeStar(N*2,bw);
        bw.write("\n");
        for(int i=N-1;i>=1;i--){
            writeStar(i, bw);
            for(int j=N;j>i;j--){
                bw.write("  ");
            }
            writeStar(i, bw);
            bw.write("\n");
        }
        bw.flush();
    }
    public static void writeStar(int length, BufferedWriter bw) throws IOException{
        for(int j=1;j<=length;j++)
            bw.write("*");
    }
}