import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, M, ans;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = 0;

        ans = Integer.MAX_VALUE;
        while (end < N) {
            if (arr[end] - arr[start] < M) {
                end++;
                continue;
            }
            if (arr[end] - arr[start] == M) {
                ans = M;
                break;
            }

            ans = Math.min(ans, arr[end] - arr[start]);
            start++;
        }

        System.out.println(ans);
    }
}