import java.util.*;
import java.io.*;

public class AutoMailNaming {
    public static void main( String argv[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String companyName = br.readLine().trim();
        String nameList[] = br.readLine().split(",");
        ArrayList<String> checkList = new ArrayList<>();
        for (int j = 0; j < nameList.length; j++) {
            String str1[] = nameList[j].trim().split(" ");
            if (str1.length == 1) continue;
            String first = str1[0];
            String last = str1[str1.length - 1].replace("-", "");
            String lastFirst = last + first.charAt(0);
            int cnt = 0;
            checkList.add(lastFirst);
            for (int i = 0; i < checkList.size(); i++) {
                if (checkList.get(i).equals(lastFirst)) cnt++;
            }
            if (cnt > 1) {
                lastFirst += cnt;
            }
            String email = lastFirst + "@" + companyName + ".com";
            bw.write(email.toLowerCase() + (j == nameList.length - 1 ? "" : ",\n"));
        }
        bw.flush();
    }
}
