import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[][] dp = new long[1001][10];
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(10);
        } else if (N == 2) {
            System.out.println(55);
        } else {
            for (int i = 0; i <= 9; i++) {
                dp[1][i] = 1;
            }

            int val = 10;
            for (int i = 0; i <= 9; i++) {
                dp[2][i] = val--;
            }

            for (int i = 3; i <= N; i++) {
                // 각 행의 첫 번째 수를 정해준다.
                long start = 0;
                for (long num : dp[i - 1]) {
                    start += num;
                }

                for (int j = 0; j <= 9; j++) {
                    if (j == 0) {
                        dp[i][j] = start;
                    } else {
                        dp[i][j] = (dp[i][j - 1] - dp[i - 1][j - 1] + 10007) % 10007;
                    }

//                    dp[i][j] = mod(dp[i][j]);
                }
            }

            long ans = 0;
            for (long num : dp[N]) {
                ans += num;
            }

            System.out.println(mod(ans));
        }
    }

    private static long mod(long num) {
        return num % 10007;
    }

    static void printDp() {
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}