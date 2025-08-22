import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] arr = new int[str.length() + 1];

        for (int i = 1; i <= str.length(); i++) {
            arr[i] = str.charAt(i - 1) - '0';
        }

        int[] dp = new int[str.length() + 1];
        dp[0] = 1;

        if (arr[1] == 0) {
            System.out.println(0);
            return;
        }

        if (arr[1] > 0) {
            dp[1] = 1;
        }

        for (int i = 2; i <= str.length(); i++) {

            // 한 자리 먼저
            if (1 <= arr[i] && arr[i] <= 9) {
                dp[i] = (dp[i] + dp[i - 1]) % 1000000;
            }

            // 두 자리
            int towDigit = arr[i - 1] * 10 + arr[i];
            if (10 <= towDigit && towDigit <= 26) {
                dp[i] = (dp[i] + dp[i - 2]) % 1000000;
            }
        }

        System.out.println(dp[str.length()] % 1000000);
    }
}