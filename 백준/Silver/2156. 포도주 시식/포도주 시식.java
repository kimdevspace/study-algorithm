import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] dp = new int[10001];
    static int[] wine = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(wine[1]);
        } else if (N == 2) {
            System.out.println(wine[1] + wine[2]);
        } else {
            dp[1] = wine[1];
            dp[2] = wine[1] + wine[2];

            for (int i = 3; i <= N; i++) {
                dp[i] = Math.max(Math.max(dp[i - 1], dp[i - 2] + wine[i]), dp[i - 3] + wine[i - 1] + wine[i]);
            }

            System.out.println(dp[N]);
        }
    }
}