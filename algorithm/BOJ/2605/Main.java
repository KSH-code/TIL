import java.io.*;
import java.util.*;

/**
 * BOJ 2605 줄 세우기
 * https://gist.github.com/KSH-code/5d0af23c0bd3317ce83254be13a672f9
 */
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        String str1[] = br.readLine().split(" ");
        for(int i = 2; i<=N; i++){
            linkedList.add(linkedList.size() - Integer.parseInt(str1[i - 1]), i);
        }

        for(int i = 0; i<N; i++){
            bw.write(linkedList.get(i) + " ");
        }

        bw.flush();

    }
}