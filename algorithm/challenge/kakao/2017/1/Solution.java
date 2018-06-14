import java.util.*;
import java.io.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String answer []= new String[n];
        boolean check [][]= new boolean[n][n];
        String temp="";
        for(int i=0;i<n;i++){

            for(int j=n-2;j>=0;j--){
                if((arr1[i]&2<<j)>0){
                    check[i][n-2-j]=true;
                }
            }
            if((arr1[i]&1)>0){
                check[i][n-1]=true;
            }

            for(int j=n-2;j>=0;j--){
                if((arr2[i]&2<<j)>0){
                    check[i][n-2-j]=true;
                }
            }
            if((arr2[i]&1)>0){
                check[i][n-1]=true;
            }
        }
        for(int i=0;i<n;i++){
            temp="";
            for(int j=0;j<n;j++){
                if(check[i][j])
                    temp+="#";
                else{
                    temp+=" ";
                }
            }
            answer[i]=temp;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
    }
  }