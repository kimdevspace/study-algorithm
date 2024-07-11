import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char[] arr = S.toCharArray();
        int i = Integer.parseInt(br.readLine());
        System.out.println(arr[i - 1]);
    }
}