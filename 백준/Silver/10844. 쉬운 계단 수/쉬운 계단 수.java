import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[][] dp = new long[101][10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        long ans = 0;

        if (N == 1) {
            for (long num : dp[1]) {
                ans += num;
            }
            System.out.println(ans);
            return;
        }

        // N까지 각 마지막으로 끝나는 자리수 계산
        for (int i = 2; i <= N; i++) {

            for (int j = 0; j <= 9; j++) {

                // 마지막 자리수가 0일 때
                if (j == 0) {
                    dp[i][j] = dp[i - 1][1];
                }

                // 마지막 자리수가 9일 때
                if (j == 9) {
                    dp[i][j] = dp[i - 1][8];
                }

                // 점화식
                else if (j != 0 && j != 9){
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j + 1];
                }

                dp[i][j] = mod(dp[i][j]);
            }
        }

        for (long num : dp[N]) {
            ans += num;
        }

        System.out.println(mod(ans));
    }

    private static long mod(long num) {
        return num % 1000000000;
    }
}