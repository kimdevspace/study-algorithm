import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] dp, sticker;
    static int T, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            n = Integer.parseInt(br.readLine());
            sticker = new int[2][n + 1];
            dp = new int[2][n + 1];

            for (int i = 0; i < 2; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    sticker[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int ans = 0;
            if (n == 1) {
                ans = Math.max(sticker[0][1], sticker[1][1]);
            }

            if (n == 2) {
                dp[0][1] = sticker[0][1];
                dp[1][1] = sticker[1][1];
                dp[0][2] = sticker[0][2] + sticker[1][1];
                dp[1][2] = sticker[1][2] + sticker[0][1];

                ans = Math.max(dp[0][n], dp[1][n]);
            } else if (n >= 3) {
                dp[0][1] = sticker[0][1];
                dp[1][1] = sticker[1][1];
                dp[0][2] = sticker[0][2] + sticker[1][1];
                dp[1][2] = sticker[1][2] + sticker[0][1];

                for (int j = 3; j <= n; j++) {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            dp[i][j] = Math.max(Math.max(dp[i + 1][j - 1], dp[i + 1][j - 2]), dp[i][j - 2]) + sticker[i][j];
                        } else if (i == 1) {
                            dp[i][j] = Math.max(Math.max(dp[i - 1][j - 1], dp[i - 1][j - 2]), dp[i][j - 2]) + sticker[i][j];
                        }
                    }
                }

                ans = Math.max(dp[0][n], dp[1][n]);
            }

            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}