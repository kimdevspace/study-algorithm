import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // 문자열 검증
            if (Character.isDigit(c) || c == ' ') {
                System.out.print(c);
                continue;
            }

            int asci = (int) c;

            if (Character.isUpperCase(c)) {
                int rot13 = ((asci - 65 + 13) % 26) + 65;
                System.out.print((char) rot13);
            } else if (Character.isLowerCase(c)) {
                int rot13 = ((asci - 97 + 13) % 26) + 97;
                System.out.print((char) rot13);
            }
        }
    }
}