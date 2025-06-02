import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String reverseA = "";
        String reverseB = "";

        for (int i = 2; i >= 0; i--) {
            reverseA += a.charAt(i);
            reverseB += b.charAt(i);
        }

        if (Integer.parseInt(reverseA) > Integer.parseInt(reverseB)) {
            System.out.println(reverseA);
        } else {
            System.out.println(reverseB);
        }
        

    }
}

