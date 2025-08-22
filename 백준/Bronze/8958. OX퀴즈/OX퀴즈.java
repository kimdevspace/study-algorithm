import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            String str = br.readLine();
            int sum = 0;
            int partNumber = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'O') {
                    partNumber++;
                    sum += partNumber;
                } else {
                    partNumber = 0;
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}