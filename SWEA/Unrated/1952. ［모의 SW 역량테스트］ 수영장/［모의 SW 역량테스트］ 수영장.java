import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    private static int T;
    private static int[] cost;
    private static int[] month;
    private static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {

            cost = new int[4];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) {
                cost[i] = Integer.parseInt(st.nextToken());
            }

            month = new int[13];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i < 13; i++) {
                month[i] = Integer.parseInt(st.nextToken());
            }

            ans = cost[3];
            dfs(0, 1);
            System.out.println("#" + tc + " " + ans);

        }
    }

    private static void dfs(int totalCost, int idx) {

        if (idx > 12) {
            ans = Math.min(ans, totalCost);
            return;
        }

        if (month[idx] > 0) {
            dfs(totalCost + month[idx] * cost[0], idx + 1);
            dfs(totalCost + cost[1], idx + 1);
            dfs(totalCost + cost[2], idx + 3);
        }else {
            dfs(totalCost, idx + 1);
        }
    }
}