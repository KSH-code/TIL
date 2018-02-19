import java.io.*;
import java.util.*;
/**
 *  BOJ 2590 색종이
 *  https://gist.github.com/KSH-code/1003dec637b9281c88ef3f2fb162f0c5
 */
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d[] = new int[7];

        for(int i = 1; i<=6; i++){
            d[i] = Integer.parseInt(br.readLine());
        }

        int five = d[5] * 11;
        int four = d[4] * 5;

        int panel = d[6] + d[5] + d[4];
        
        d[1] -= five;
        d[2] -= four;

        if(d[1] > 0 && d[2] < 0){
            d[1] += d[2] * 4;
        }

        panel += d[3] / 4;
        
        int three;
        if((three = (d[3] % 4)) > 0){
            panel++;
            d[2] = Math.max(d[2], 0);
            if(d[2] >= 0){
                d[2] -= 5 - (three-1) * 2;
                d[1] += d[2] * 4;
                d[1] -= 8 - three;
            }
        }
        
        if(d[2] > 0){
            panel += d[2] / 9;
            int two;
            if((two = (d[2] % 9)) > 0){
                panel++;
                int ableone = -4 * two + 36;
                d[1] -= ableone;
            }
        }
        
        while(d[1] > 0){
            panel++;
            d[1] -= 36;
        }
        System.out.println(panel);

    }
}