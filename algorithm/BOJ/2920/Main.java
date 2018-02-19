/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-09-05 04:12:13
 * @modify date 2017-09-05 04:12:13
 * @desc [https://www.acmicpc.net/problem/2920]
*/
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a[]=new int[s.split(" ").length];
        int d[]=new int[a.length-1];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s.split(" ")[i]);
        }
        for(int i=0;i<d.length;i++){
            d[i]=a[i]-a[i+1];
        }
        String check=d[0]==-1?"ascending":"descending";
        for(int i=0;i<d.length-1;i++){
            if(d[i]!=d[i+1]){
                System.out.println("mixed");
                return;
            }
        }
        System.out.println(check);
    }
}