import java.util.*;
import java.io.*;
/**
 * BOJ 백준온라인져지 2185 직사각형의 합집합 풀이
 * 아직 코드는 안짬
 * 솔루션 : 
 * 1. (0,0) (N,0) 부터 (0,M) (N,M) 까지 둘레의 가로길이 찾고
 * 2. (0,0) (0,M) 부터 (N,0) (N,M) 까지 둘레의 세로길이를 찾자
 * 참고 : https://blog.sisobus.com/2014/02/plane-sweeping.html#.WgwlJbSFjBI
 *       http://codedoc.tistory.com/421
 */
public class Main {
    public static void main(String args[]) {
        
    }

    static class Rect {
        int x1, y1, x2, y2;
        public Rect(int a,int b,int c, int d){
            x1 = a, y1 = b;
            x2 = c, y2 = d;
        }
    }
}