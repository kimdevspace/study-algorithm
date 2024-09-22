import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cost = {300, 60, 10};

        int N = Integer.parseInt(br.readLine());
        int[] ans = new int[3];

        for (int i = 0; i < 3; i++) {
            ans[i] = N / cost[i];
            N = N % cost[i];
        }

        if (N == 0) {
            print(ans);
        }else {
            System.out.println(-1);
        }



    }

    private static void print(int[] arr) {
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}