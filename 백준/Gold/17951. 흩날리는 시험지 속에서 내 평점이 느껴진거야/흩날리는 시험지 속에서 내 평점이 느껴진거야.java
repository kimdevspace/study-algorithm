import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int left = Integer.MAX_VALUE;
        int right = 0;
        for (int i = 0; i < N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            right += arr[i];
            left = Math.min(left, arr[i]);
        }

        while (left <= right) {
            int mid = (left + right) / 2;
            int groupCount = 0;
            int total = 0;
            for (int num : arr) {
                total += num;
                if (total >= mid) {
                    groupCount++;
                    total = 0;
                }
            }

            if (groupCount < K) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(right);
    }
}