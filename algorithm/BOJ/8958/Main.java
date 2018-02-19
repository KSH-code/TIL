/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-09-05 04:02:42
 * @modify date 2017-09-05 04:02:42
 * @desc [https://www.acmicpc.net/problem/8958]
*/
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine().trim());
        int r[]=new int[a];
        for(int i = 0;i<a;i++){
            String s = sc.nextLine();
            int c=0;
            int result=0;
            for(char ab : s.toCharArray()){
                if(ab=='O')
                    c++;
                else
                    c=0;
                result+=c;
            }
            r[i]=result;
        }
        for(int i=0;i<a;i++)
            System.out.println(r[i]);
    }
}
