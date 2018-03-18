import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2564
 * BOJ 백준온라인져지 2564 경비원 풀이
 */
public class Main {
    static class Position {
        public int x, y, d;
        public Position (int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str1[] = br.readLine().split(" ");
        int width = Integer.parseInt(str1[0]);
        int height = Integer.parseInt(str1[1]);
        int N = Integer.parseInt(br.readLine());
        ArrayList<Position> positionList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            String str2[] = br.readLine().split(" ");
            int direction = Integer.parseInt(str2[0]);
            int j = Integer.parseInt(str2[1]);
            int x = 0;
            int y = 0;
            switch (direction) {
                case 1:
                    x = j;
                    y = height;
                    break;
                case 2:
                    x = j;
                    y = 0;
                    break;
                case 3:
                    x = 0;
                    y = height - j;
                    break;
                case 4:
                    x = width;
                    y = height - j;
                    break;
            }
            positionList.add(new Position(x, y, direction));
        }
        int sumDistance = 0;
        Position p1 = positionList.get(N);
        for (int i = 0; i < N; i++) {
            Position p2 = positionList.get(i);
            if ((p1.d == 1 && p2.d == 2) || (p1.d == 2 && p2.d == 1)) {
                sumDistance += Math.min(p1.x + p2.x + p1.y + p2.y, width - p1.x + width - p2.x + p1.y + p2.y);
            } else if ((p1.d == 3 && p2.d == 4) || (p1.d == 4 && p2.d == 3)) {
                sumDistance += Math.min(p1.x + p2.x + p1.y + p2.y, p1.x + p2.x + height - p1.y + height - p2.y);
            } else {
                sumDistance += Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
            }
        }
        bw.write(String.valueOf(sumDistance));
        bw.flush();
    }
}