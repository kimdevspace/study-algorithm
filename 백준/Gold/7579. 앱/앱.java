import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, ans;
    static int[] memories, costs;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        memories = new int[N + 1];
        costs = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            memories[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            costs[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[N + 1][10001];
        ans = Integer.MAX_VALUE;
        for (int i = 1; i < N + 1; i++) {
            int cost = costs[i];
            for (int j = 0; j < 10001; j++) {
                if (cost > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - cost] + memories[i]);
                }

                if (dp[i][j] >= M) {
                    ans = Math.min(ans, j);
                }
            }
        }

        System.out.println(ans);
    }
}