import java.io.*;
import java.util.*;

/**
 * BOJ 2608 로마 숫자 풀이
 * https://gist.github.com/KSH-code/c90a9fe61c3d8f0a2d517bafbbd68d15
 */
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        int sum = StringToNumber(str1) + StringToNumber(str2);
        System.out.println(sum);
        System.out.println(NumberToString("", sum));
    }
    private static String NumberToString(String s,int num){
        while(num >= 1000){
            s += "M";
            num -= 1000;
        }
        if(num >= 900){
            s+= "CM";
            num -= 900;
        }
        if(num >= 500){
            s+= "D";
            num -= 500;
        }
        if(num >= 400){
            s+= "CD";
            num -= 400;
        }
        while(num >= 100){
            s += "C";
            num -= 100;
        }
        if(num >= 90){
            s+= "XC";
            num -= 90;
        }
        if(num >= 50){
            s+= "L";
            num -= 50;
        }
        if(num >= 40){
            s+= "XL";
            num -= 40;
        }
        while(num >= 10){
            s += "X";
            num -= 10;
        }
        if(num >= 9){
            s+= "IX";
            num -= 9;
        }
        if(num >= 5){
            s+= "V";
            num -= 5;
        }
        if(num >= 4){
            s+= "IV";
            num -= 4;
        }
        while(num >= 1){
            s += "I";
            num -= 1;
        }
        return s;
    }
    private static int StringToNumber(String str){
        int sum = 0;
        
        for(int i = 0; i<str.length(); i++){
            char C = str.charAt(i);
            if(i+1<str.length()){
                String temp = String.valueOf(C) + String.valueOf(str.charAt(i+1));
                switch(temp){
                    case "CM":
                        sum+= 900;
                        break;
                    case "CD":
                        sum+= 400;
                        break;
                    case "XC":
                        sum+= 90;
                        break;
                    case "XL":
                        sum+= 40;
                        break;
                    case "IX":
                        sum+= 9;
                        break;
                    case "IV":
                        sum+= 4;
                        break;
                    default:
                        sum += charToNumber(C);
                        i--;
                        break;
                }
                i++;
            }else
                sum += charToNumber(C);
        }
        return sum;
    }
    private static int charToNumber(char C){
        switch(C){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}