import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger big = new BigInteger("1");
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }

        String str = big + "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') cnt++;
            else break;
        }
        System.out.println(cnt);
    }
}