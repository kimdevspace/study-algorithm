import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] dp = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        dp[6] = 3;

        for (int i = 7; i < 101; i++) {
            dp[i] = dp[i - 5] + dp[i - 1];
        }

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0 ; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());

            System.out.println(dp[N]);
        }
    }
}