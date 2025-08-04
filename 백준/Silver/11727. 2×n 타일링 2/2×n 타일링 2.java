import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        dp[1] = mod(1);

        if (N >= 2) {
            dp[2] = mod(3);
            for (int i = 3; i <= N; i++) {
                dp[i] = dp[i - 1] + 2 * dp[i - 2];
                dp[i] = mod(dp[i]);
            }
        }

        System.out.println(dp[N]);
    }

    private static int mod(int num) {
        return num % 10007;
    }
}