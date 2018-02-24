import java.util.*;
import java.io.*;
/**
 * https://www.acmicpc.net/contest/problem/271/1
 * BOJ 백준온라인져지 271/1 A번 - 부당한 퍼즐 풀이
 */
class Main {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    if (N == 1) {
      System.out.println("good puzzle");
      return;
    }
    int d1[][] = new int[N + 1][2];
    int d2[][] = new int[N + 1][2];
    String str1[] = br.readLine().split(" ");
    String str2[] = br.readLine().split(" ");
    int pre = Integer.parseInt(str1[0]);
    d1[pre][0] = Integer.parseInt(str1[str1.length - 1]);
    d1[pre][1] = Integer.parseInt(str1[1]);
    int last = Integer.parseInt(str1[str1.length - 1]);
    d1[last][0] = Integer.parseInt(str1[str1.length - 2]);
    d1[last][1] = pre;
    for (int i = 1; i < N - 1; i++) {
      int cur = Integer.parseInt(str1[i]);
      d1[cur][1] = Integer.parseInt(str1[i + 1]);
      d1[cur][0] = pre;
      pre = cur;
    }
    pre = Integer.parseInt(str2[0]);
    d2[pre][0] = Integer.parseInt(str2[str2.length - 1]);
    d2[pre][1] = Integer.parseInt(str2[1]);
    last = Integer.parseInt(str2[str2.length - 1]);
    d2[last][0] = Integer.parseInt(str2[str2.length - 2]);
    d2[last][1] = pre;
    for (int i = 1; i < N - 1; i++) {
      int cur = Integer.parseInt(str2[i]);
      d2[cur][1] = Integer.parseInt(str2[i + 1]);
      d2[cur][0] = pre;
      pre = cur;
    }
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < 2; j++) {
        if (d1[i][j] != d2[i][j]) {
          if (d1[i][0] == d2[i][1] && d1[i][1] == d2[i][0]) continue;
          System.out.println("bad puzzle");
          return;
        }
      }
    }
    System.out.println("good puzzle");
  }
}