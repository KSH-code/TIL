import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int str1Length = str1.length()-1;
        int str2Length = str2.length()-1;
        HashMap<String,Integer> a = new HashMap<>(); 
        HashMap<String,Integer> b = new HashMap<>(); 
        int ry=0,gkq=0;
        String s_temp;
        int temp;
        for(int i = 0;i<str1Length;i++){
            if(isEnglish(str1.charAt(i))&&isEnglish(str1.charAt(i+1))){
                s_temp=str1.substring(i,i+2).toLowerCase();
                if(a.containsKey(s_temp)){
                    temp=a.get(s_temp);
                    a.replace(s_temp, temp+1);
                }else{
                    a.put(s_temp, 1);
                }
            }
        }

        for(int i = 0;i<str2Length;i++){
            if(isEnglish(str2.charAt(i))&&isEnglish(str2.charAt(i+1))){
                s_temp=str2.substring(i,i+2).toLowerCase();
                if(b.containsKey(s_temp)){
                    temp=b.get(s_temp);
                    b.replace(s_temp, temp+1);
                }else{
                    b.put(s_temp, 1);
                }
            }
        }
        int max=0,min=0;
        Map.Entry<String, Integer> entry;
        while(a.size()>0){
            entry=a.entrySet().iterator().next();
            if(b.containsKey(entry.getKey())){
                max=Math.max(entry.getValue(), b.get(entry.getKey()));
                min=Math.min(entry.getValue(), b.get(entry.getKey()));
            }else{
                min=0;
                max=entry.getValue();
            }
            a.remove(entry.getKey());
            b.remove(entry.getKey());
            ry+=min;
            gkq+=max;
        }
        while(b.size()>0){
            entry=b.entrySet().iterator().next();
            gkq+=entry.getValue();
            b.remove(entry.getKey());
        }
        if(ry==0)
            return 0;
        answer=((int)(((double)ry/(double)gkq)*65536));
        return answer;
    }
    private boolean isEnglish(char a){
        int temp = (int)a;
        if(temp>=60&&temp<=90||temp>=97&&temp<=122){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solution("aa1+aa2","AAAA12"));
    }
}

