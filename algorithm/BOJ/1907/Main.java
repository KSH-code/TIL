
import java.io.*;
import java.util.*;
/**
 *  BOJ 1907 탄소 화합물
 *  https://gist.github.com/KSH-code/a53903cfa3d3ed0a0391637676d058a5
 */
class Main{

    private static int q[][] = new int[3][3];
    private static int result[] = new int[3];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String M123[] = s.split("\\+");
        String M1 = M123[0];
        String M23[] = M123[1].split("=");
        String M2 = M23[0]; 
        String M3 = M23[1];
        Arrays.fill(result, 1);
        divide(M1, 0, 0);
        divide(M2, 0, 1);
        divide(M3, 0, 2);
        for(int i = 1; i<=10; i++){
            for(int k = 1; k<= 10; k++){
                for(int j = 1; j<= 10; j++){
                    int C,H,O;
                    C = j * q[1][0] + k * q[0][0];
                    H = j * q[1][1] + k * q[0][1];
                    O = j * q[1][2] + k * q[0][2];
                    int CC,HH,OO;
                    CC = i * q[2][0];
                    HH = i * q[2][1];
                    OO = i * q[2][2];
                    if(C == CC){
                        if(H == HH){
                            if(O == OO){
                                System.out.println(k + " " + j + " " + i);
                                return;
                            }
                        }
                    }
                }
            }
        }

    }

    private static void divide(String s, int idx, int midx){
        if(idx >= s.length())
            return;
        switch (s.charAt(idx)) {
            case 'C':
                q[midx][0] += getCount(s, idx+1);
                break;
            case 'H':
                q[midx][1] += getCount(s, idx+1);
                break;
            case 'O':
                q[midx][2] += getCount(s, idx+1);
                break;
            default:
                break;
        }
        divide(s, idx + 1, midx);
    }
    private static int getCount(String s, int idx){
        if(idx >= s.length()){
            return 1;
        }else{
            if(s.charAt(idx) >= '2' && s.charAt(idx) <= '9'){
                return s.charAt(idx) - 48;
            }else{
                return 1;
            }
        }
    }
}