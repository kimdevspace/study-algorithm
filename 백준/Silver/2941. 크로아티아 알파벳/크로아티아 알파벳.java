import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (String a : alpha) {
            if (str.contains(a)) {
                str = str.replace(a, ",");
            }
        }
        System.out.println(str.length());
        
    }
}
