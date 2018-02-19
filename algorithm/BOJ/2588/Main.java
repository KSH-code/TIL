import java.io.*;
import java.util.*;

/**
 * BOJ 2588 곱셈
 * https://gist.github.com/KSH-code/5b200f589616a8044f820c247fa9bd87
 */
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(a * (b%10));
        System.out.println(a * (b%100/10));
        System.out.println(a * (b/100));
        System.out.println(a * b);
    }
}