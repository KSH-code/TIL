import java.util.*;
import java.io.*;
/**
 * https://www.acmicpc.net/problem/10845
 * BOJ 백준온라인져지 10845 큐 풀이
 */
class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0){
            String str1[] = br.readLine().split(" ");
            String temp = str1[0];
            if(temp.equals("push")){
                int number = Integer.parseInt(str1[1]);
                queue.offer(number);
            }else if(temp.equals("pop")){
                if(!isEmpty(queue, bw)){
                    bw.write(queue.poll() + "\n");
                }
            }else if(temp.equals("size")){
                bw.write(queue.size() + "\n");
            }else if(temp.equals("empty")){
                bw.write((queue.isEmpty() ? 1 : 0) + "\n");
            }else if(temp.equals("back")){
                if(!isEmpty(queue, bw)){
                    Iterator<Integer> it = queue.iterator();
                    int tempInteger = 0;
                    while(it.hasNext()) tempInteger = it.next();
                    bw.write(tempInteger + "\n");
                }
            }else if(temp.equals("front")){
                if(!isEmpty(queue, bw)){
                    bw.write(queue.peek() + "\n");
                }
            }
        }

        bw.flush();
    }
    private static boolean isEmpty(Queue<Integer> queue, BufferedWriter bw) throws IOException{
        if(queue.isEmpty()){
            bw.write("-1\n");
        }
        return queue.isEmpty();
    }
}