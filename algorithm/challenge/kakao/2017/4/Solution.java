import java.util.*;
class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        Queue<Integer> people = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int temp;
        String s_temp;
        int last;
        int mtemp=0;
        for(int i=0;i<timetable.length;i++){
            s_temp=timetable[i].replace(":", "");
            temp = Integer.parseInt(s_temp);
            if(temp>1900){
                continue;
            }
            people.offer(temp);
        }

        Collections.sort((List<Integer>)people);
        boolean lastlast = false;
        int mytime = 900;

        for(int i=0;i<n;i++){
            mtemp=m;
            while(mtemp>0){
                mytime=900+hourCheck(t*i);
                if(people.size()==0){
                    lastlast=true;
                    break;
                }
                last=people.peek();
                if(last<=mytime){
                    stack.push(people.poll());
                }else{
                    break;
                }
                mtemp--;
            }           
        }
        if(lastlast||mtemp>0){
            return intToString(mytime);
        }
        return intToString(Check(stack.pop(),-1));
    }
    private int hourCheck(int minute){
        if(minute>=60){
            int hour=(minute)/60*100;
            int m=minute%60;
            return hour+m;
        }
        return minute;
    }
    private int Check(int time,int min){
        int temp;
        if((time%100)+min<0){
            int hour=time/100-1;
            int t=60+((time%100)+min);
            temp=hour*100+t;
        }else{
            temp=time+min;
        }
        return temp;
    }
    private String intToString(int i){
        String s;
        if(i<1000){
            s="0"+String.valueOf(i/100);
        }else{
            s=String.valueOf(i/100);
        }
        s+=":";
        int m=i%100;
        if(m<10)
            s+="0";            
        s+=String.valueOf(m);
        return s;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solution(1, 1, 4, new String[]{"09:00", "09:00", "09:00", "18:59"}));
    }
  }