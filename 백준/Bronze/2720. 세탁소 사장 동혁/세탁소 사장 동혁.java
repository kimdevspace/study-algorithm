
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cost = {25, 10, 5, 1};

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] ans = new int[4];

            for (int i = 0; i < 4; i++) {
                ans[i] = N / cost[i];
                N = N % cost[i];
            }

            print(ans);
            System.out.println();
        }

    }

    private static void print(int[] arr) {
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}