/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-09-05 03:38:05
 * @modify date 2017-09-05 03:38:05
 * @desc [https://www.acmicpc.net/problem/1152]
*/
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int o=0;
        for(String ss : s.split(" ")){
            if(!ss.isEmpty()){
                o++;
            }
        }
        System.out.println(o);
    }
}