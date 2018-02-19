
import java.io.*;
import java.util.*;
/**
 *  BOJ 14894 퀵 소트 cnt++
 */
public class Main{
    public static long count = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        String str1[] = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(str1[i]);
        }
        Thread1 t1 = new Thread1(arr);
        t1.start();
        System.out.println(count);
        // System.out.println(N * ((int)Math.floor(Math.log(N) / Math.log(2))) + 1);
        // System.out.println(arr);
    }
    
}
class Go{
    public Go(int a[]){
        quickSort(a);
    }
public void quickSort(int arr[]) {
    
    Main.count++;
    if (arr.length <= 1) return;
    LinkedList<Integer> less = new LinkedList<>();
    LinkedList<Integer> greater = new LinkedList<>();
    int pivot = arr[arr.length/2-1];
    for (int i=arr.length-1; i >= 0; i--) {
        int t = arr[i];
        if(pivot != t){
            if(t > pivot) {
                // count++;
                less.add(t);
            }else{
                Main.count++;
                greater.add(t);
            }
        }
    }
    int lesss[] = new int[less.size()];
    for(int i = 0; i<less.size(); i++){
        lesss[i] = less.get(i);
    }
    int greaterr[] = new int[greater.size()];
    for(int i = 0; i<greater.size(); i++){
        greaterr[i] = greater.get(i);
    }
    new Thread1(lesss).start();
    new Thread1(greaterr).start();
}
}
class Thread1 extends Thread{
    
    //  run() 메서드 오버라이딩
    private int arr[];
    public Thread1(int arr[]){
        this.arr = arr;
    }
    public void run(){

    //스레드에서 실행할 작업

        new Go(arr);

    }
    
}