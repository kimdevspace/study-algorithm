import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int T, N, M, ans;
    static int[] coins;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            N = Integer.parseInt(br.readLine()); // 동전의 가지 수
            coins = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i < N + 1; i++) {
                coins[i] = Integer.parseInt(st.nextToken());
            }
            M = Integer.parseInt(br.readLine());

            int[] dp = new int[M + 1];
            dp[0] = 1;
            for (int i = 1; i < N + 1; i++) {
                int coin = coins[i];
                for (int j = coin; j < M + 1; j++) {
                    dp[j] += dp[j - coin];
                }
            }

            System.out.println(dp[M]);
        }
    }
}