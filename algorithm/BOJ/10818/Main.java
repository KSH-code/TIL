import java.io.*;
public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i<N; i++){
            int temp = Integer.parseInt(str1[i]);
            if(temp < min){
                min = temp;
            }
            if(temp > max){
                max = temp;
            }
        }
        System.out.println(min + " " + max);
    }
}