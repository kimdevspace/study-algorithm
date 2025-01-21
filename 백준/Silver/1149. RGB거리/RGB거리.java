import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static int N, ans;
    static int[][] house;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        N = Integer.parseInt(br.readLine());
        house = new int[N][3];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                house[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ans = Integer.MAX_VALUE;
        int[][] dp = new int[N + 1][3];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][j + 1] + house[i - 1][j], dp[i - 1][j + 2] + house[i - 1][j]);
                } else if (j == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + house[i - 1][j], dp[i - 1][j + 1] + house[i - 1][j]);
                } else if (j == 2) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + house[i - 1][j], dp[i - 1][j - 2] + house[i - 1][j]);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            ans = Math.min(ans, dp[N][i]);
        }

        System.out.println(ans);
    }
}