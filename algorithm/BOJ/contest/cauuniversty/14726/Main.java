import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
        String str1;
        for(int i = 0; i<n; i++){
            str1 = br.readLine();
            str1 = changeEven(str1);
            if(checkCredit(str1)){
                bw.write("T\n");
            }else{
                bw.write("F\n");
            }
        }
		bw.flush();
	}
    private static String changeEven(String str){
        int check;
        char temp[] = str.toCharArray();
        for(int i = temp.length-2;i>=0; i-=2){
            check = ((int)temp[i] - 48) * 2;
            if(check>9){
                check = check % 10 + check / 10;
            }
            temp[i] = (char)(check + 48);
        }
        return String.valueOf(temp);
    }
    private static boolean checkCredit(String str){
        int check = 0;
        char temp[] = str.toCharArray();
        for(int i = 0;i<temp.length; i++){
            check += ((int) temp[i]) - 48;
        }
        return check % 10 == 0;
    }
}