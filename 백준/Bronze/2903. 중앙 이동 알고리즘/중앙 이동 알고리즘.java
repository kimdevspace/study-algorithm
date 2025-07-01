import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(9);
        } else {
            int[] dp = new int[N + 1];

            dp[0] = 4; // 2^2
            dp[1] = 9; // 3^2
            dp[2] = 25; // 5^2

            for (int i = 3; i <= N; i++) {
                dp[i] = (int) Math.pow((int) Math.sqrt(dp[i - 1]) + (int) Math.pow(2, i - 1), 2);
            }

            System.out.println(dp[N]);
        }

    }
}
