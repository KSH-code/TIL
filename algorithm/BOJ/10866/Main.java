import java.util.*;
import java.io.*;
/**
 * https://www.acmicpc.net/problem/10866
 * BOJ 백준온라인져지 10866 덱 풀이
 */
class Main {

  static class Node {
    public Node l = null, r = null;
    public String n;
    public Node (String n) {
      this.n = n;
    }
  }

  private static Node head = null;
  private static int size = 0;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String str = br.readLine();
      String n = "";
      if (str.split(" ").length > 1) {
        n = str.split(" ")[1];
        size++;
      }
      String command = str.split(" ")[0];
      if (command.equals("push_front")) {
        Node first = new Node(n);
        if (size > 1) {
          if (size == 2) {
            head.l = head.r = first;
            first.l = first.r = head;
          } else {
            first.r = head;
            first.l = head.l;
            head.l.r = head.l = first;
          }
          head = first;
        } else head = first;
      } else if (command.equals("push_back")) {
        Node last = new Node(n);
        if (size > 1) {
          if (size == 2) {
            head.l = head.r = last;
            last.l = last.r = head;
          } else {
            last.l = head.l;
            last.r = head;
            head.l = head.l.r = last;
          }
        } else head = last;
      } else if (command.equals("pop_front")) {
        if (size == 0) {
          bw.write("-1");
        } else if (size == 1) {
          bw.write(head.n);
          head = null;
          size--;
        } else {
          bw.write(head.n);
          if (size > 2){
            head.l.r = head.r;
            head.r.l = head.l;
          } else {
            head.l.r = head.l.l = null;
          }
          head = head.r;
          size--;
        }
        bw.write("\n");
      } else if (command.equals("pop_back")) {
        if (size == 0) {
          bw.write("-1");
        } else if (size == 1) {
          bw.write(head.n);
          head = null;
          size--;
        } else {
          bw.write(head.l.n);
          if (size > 2){
            head.l = head.l.l;
            head.l.r = head;
          } else {
            head.r = head.l = null;
          }
          size--;
        }
        bw.write("\n");
      } else if (command.equals("size")) {
        bw.write(String.valueOf(size));
        bw.write("\n");
      } else if (command.equals("empty")) {
        bw.write(size == 0 ? "1" : "0");
        bw.write("\n");
      } else if (command.equals("front")) {
        bw.write(head != null ? head.n : "-1");
        bw.write("\n");
      } else if (command.equals("back")) {
        if (size == 0) {
          bw.write("-1");
        } else if (size == 1) {
          bw.write(head.n);
        } else {
          bw.write(head.l.n);
        }
        bw.write("\n");
      }
    }
    bw.flush();
  }
}