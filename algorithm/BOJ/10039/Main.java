/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-09-05 04:23:45
 * @modify date 2017-09-05 04:23:45
 * @desc [https://www.acmicpc.net/problem/10039]
*/
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i =0;i<5;i++){
            int d=Integer.parseInt(sc.nextLine())/5;
            if(d<8){
                d=8;
            }
            sum+=d;
        }
        System.out.println(sum);
    }
}