import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> lds = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int pos = bs(lds, arr[i]);

            if (pos == lds.size()) {
                lds.add(arr[i]);
            } else {
                lds.set(pos, arr[i]);
            }
        }

        System.out.println(lds.size());
    }

    private static int bs(List<Integer> lds, int target) {
        int left = 0;
        int right = lds.size();

        while (left < right) {
            int mid = (left + right) / 2;

            if (lds.get(mid) > target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}