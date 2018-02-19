/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-09-13 12:53:49
 * @modify date 2017-09-13 12:53:49
 * @desc [https://www.acmicpc.net/problem/1193]
*/


import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        int i=X;
        int temp=1;
        while(i-temp>0){
            i-=temp;
            temp++;
        }
        int a,b;
        if(temp%2==0){
            a=i;
        }else{
            a=temp-i+1;
        }
        if(temp%2==1){
            b=i;
        }else{
            b=temp-i+1;
        }
        bw.write(a+"/"+b);
        bw.flush();
    }
}