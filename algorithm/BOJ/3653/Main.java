
import java.io.*;
import java.util.*;
/**
 *  BOJ 3653 영화 수집
 *  https://gist.github.com/KSH-code/37000fdf74880be28a39b5878b5ca847
 */
public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            String str1[] = br.readLine().split(" ");
            int n = Integer.parseInt(str1[0]);
            int m = Integer.parseInt(str1[1]);
            String str2[] = br.readLine().split(" ");
            FenwickTree tree = new FenwickTree(n + m + 1);
            int arr[] = new int[n + 1];
            for(int k = 1; k<=n; k++){
                arr[k] = k + m;
                tree.update(arr[k], 1);
            }
            System.out.println(Arrays.toString(arr));
            for(int j = 0; j<m; j++){
                int idx = Integer.parseInt(str2[j]);
                bw.write((tree.sum(arr[idx]) - 1) + " ");
                tree.update(arr[idx], -1);
                arr[idx] = m - j;
                tree.update(arr[idx], 1);
            }
            bw.write("\n");
        }
        bw.flush();
    }
    
}
class FenwickTree{
    private int tree[];
    public FenwickTree(int n){
        tree = new int[n];
    }
    public int sum(int i) {
        int ans = 0;
        while (i > 0) {
            ans += tree[i];
            i -= (i & -i);
        }
        return ans;
    }
    public void update(int i, int num) {
        while (i < tree.length) {
            tree[i] += num;
            i += (i & -i);
        }
    }
}