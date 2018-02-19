import java.io.*;
import java.util.*;
public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i<N; i++){
            String str1[] = br.readLine().split(" ");
            switch(str1[0]){
                case "add":
                    int idx = list.indexOf(Integer.parseInt(str1[1]));
                    if(idx == -1){
                        list.add(Integer.parseInt(str1[1]));
                    }
                    break;
                case "remove":
                    idx = list.indexOf(Integer.parseInt(str1[1]));
                    if(idx > -1){
                        list.remove(idx);
                    }
                    break;
                case "check":
                    if(list.indexOf(Integer.parseInt(str1[1])) == -1){
                        bw.write("0");
                    }else{
                        bw.write("1");
                    }
                    bw.write("\n");
                    break;
                case "toggle":
                    idx = list.indexOf(Integer.parseInt(str1[1]));
                    if(idx == -1){
                        list.add(Integer.parseInt(str1[1]));
                    }else{
                        list.remove(idx);
                    }
                    break;
                case "all":
                    int M = 20;
                    list.clear();
                    for(int j = 1; j<=M; j++){
                        list.add(j);
                    }
                    break;
                case "empty":
                    list.clear();
                    break;
            }
        }
        bw.flush();
    }
}