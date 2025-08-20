import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = 1;
        for (int i = 0; i < 3; i++) {
            number *= Integer.parseInt(br.readLine());
        }

        int[] cnt = new int[10];
        String str = number + "";
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            cnt[num]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(cnt[i]);
        }

    }
}