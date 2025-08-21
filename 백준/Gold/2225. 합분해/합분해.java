import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[][] dp = new long[N + 1][K + 1];

        for (int i = 1; i < K + 1; i++) {
            dp[1][i] = i;
        }

        for (int i = 2; i < N + 1; i++) {
            for (int j = 1; j < K + 1; j++) {
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % 1_000_000_000;
            }
        }

        System.out.println(dp[N][K] % 1_000_000_000);
    }
}