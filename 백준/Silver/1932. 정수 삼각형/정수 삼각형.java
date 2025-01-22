import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, ans;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[N][N];
        dp[0][0] = arr[0][0];
        ans = 0;
        if (N == 1) ans = arr[0][0];
        else {
            for (int i = 1; i < N; i++) {
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0) {
                        dp[i][j] = dp[i - 1][j] + arr[i][j];
                        continue;
                    }
                    dp[i][j] = Math.max(dp[i - 1][j - 1] + arr[i][j], dp[i - 1][j] + arr[i][j]);
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        System.out.println(ans);
    }
}