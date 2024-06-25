import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (b<45) {
            a--;
            b = b + 60 - 45;

            if (a<0) {
                a = 23;
            }
            System.out.println(a + " " + b);
        }
        else {
            System.out.println(a + " " + (b - 45));
        }
    }
}