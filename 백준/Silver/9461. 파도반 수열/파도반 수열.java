import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] dp = new long[101];
        int[] startArr = {0, 1, 1, 1, 2, 2, 3, 4, 5, 7, 9};
        for (int i = 1; i < startArr.length; i++) {
            dp[i] = startArr[i];
        }

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            if (N <= 10) {
                System.out.println(dp[N]);
            } else {
                for (int i = 11; i <= N; i++) {
                    dp[i] = dp[i - 1] + dp[i - 5];
                }
                System.out.println(dp[N]);
            }
        }
    }
}