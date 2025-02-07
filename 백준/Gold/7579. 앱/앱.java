import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] memories = new int[N + 1];
        int[] costs = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            memories[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int maxCost = 0;
        for (int i = 1; i < N + 1; i++) {
            costs[i] = Integer.parseInt(st.nextToken());
            maxCost += costs[i];
        }

        int[] dp = new int[maxCost + 1];
        for (int i = 1; i < N + 1; i++) {
            int memory = memories[i];
            int cost = costs[i];
            for (int j = maxCost; j >= cost; j--) {
                dp[j] = Math.max(dp[j], dp[j - cost] + memory);
            }
        }

        int ans = 0;
        for (int i = 0; i < maxCost + 1; i++) {
            if (dp[i] >= M) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}