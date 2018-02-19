import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int one, two;
        one = Integer.parseInt(str1[0]);
        two = Integer.parseInt(str1[1]);
        int temp=0;
        while(temp!=one){
            one = returnAngle(one, 1);
            two = returnAngle(two, 12);
        }
        if(one==two){
            System.out.println("O");
        }else{
            System.out.println("X");
        }
        
    }
    private static int returnAngle(int a, int b){
        return (360+a-b)%360;
    }
}