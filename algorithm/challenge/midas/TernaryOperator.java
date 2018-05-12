import java.util.*;
import java.io.*;
import javax.script.*;

public class TernaryOperator {
    public static void main( String argv[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        if (str.split("\\?").length != str.split(":").length) {
            System.out.println(-1);
            return;
        }
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
        ScriptContext context = engine.getContext();
        StringWriter writer = new StringWriter();
        context.setWriter(writer);
        try {
            engine.eval("print(" + str + ")");
        } catch (Exception err) {
            System.out.println(-1);
            return;
        }
        String output = writer.toString();
        bw.write(output);
        bw.flush();
    }
}
