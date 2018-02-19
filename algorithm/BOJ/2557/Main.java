/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-09-05 03:38:42
 * @modify date 2017-09-05 03:38:42
 * @desc [https://www.acmicpc.net/problem/2577]
*/
import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine().trim());
        int b = Integer.parseInt(sc.nextLine().trim());
        int c = Integer.parseInt(sc.nextLine().trim());
        String s=String.valueOf(a*b*c);
        for(int i=0;i<10;i++){
            System.out.println(s.replaceAll(String.valueOf(i), " g").split(" ").length-1);
        }
    }
}