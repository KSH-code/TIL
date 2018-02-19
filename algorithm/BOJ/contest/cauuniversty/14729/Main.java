import java.util.*;
import java.io.*;
import java.text.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        float list[] = new float[7];
        Arrays.fill(list, Float.MAX_VALUE);
        list[0] = Float.parseFloat(br.readLine());
        float temp1;
        float temp2 = 0f;
        for(int i = 1;i<N;i++){
            temp1 = Float.parseFloat(br.readLine());
            for(int j = 0;j < 7; j++){
                if(list[j] >= temp1){
                    temp2 = list[j];
                    list[j] = temp1;
                    for(int k = j + 1;k < 7;k++){
                        temp1 = list[k];
                        list[k] = temp2;
                        if(k + 1 < 7)
                            temp2 = temp1;
                    }
                    break;
                }
            }
        }
        for(int i = 0;i < 7;i++){
            bw.write(format(list[i]) + "\n");
        }
		bw.flush();
	}
    private static DecimalFormat df = new DecimalFormat("##0.000");
    private static String format(Float number) {
      return df.format(number);
    }
}