import java.util.Scanner;
import java.io.IOException;

public class TwoNumSum {
    public static void main( String argv[] ) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt(); 
        int sum = A + B; 
        sc.close();
        
        System.out.println( sum );
    }
}
