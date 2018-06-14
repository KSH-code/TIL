import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        Queue<String> queue = new LinkedList<>();

        int answer = 0;
        if(cacheSize==0){
            return cities.length*5;
        }
        for(String city : cities){
            if(queue.contains(city.toLowerCase())){
                queue.remove(city.toLowerCase());
                answer++;
            }else{
                answer+=5;
            }
            if(queue.size()==cacheSize){
                queue.poll();
            }
            queue.add(city.toLowerCase());
        }
        return answer;
    }
  }