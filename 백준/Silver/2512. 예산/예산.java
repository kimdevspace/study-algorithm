import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, max, ans;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        max = Integer.parseInt(br.readLine());

        ans = 0;
        bs();
        System.out.println(ans);


    }

    private static void bs() {
        int l = 0;
        int r = arr[N - 1];

        while (l <= r) {
            int mid = (l + r) / 2;
            int total = 0;
            for (int cost : arr) {
                if (cost > mid) {
                    total += mid;
                    continue;
                }
                total += cost;
            }

            if (total == max) {
                ans = mid;
                break;
            }
            if (total > max) r = mid - 1;
            else if (total < max) {
                ans = Math.max(ans, mid);
                l = mid + 1;
            }
        }
    }
}