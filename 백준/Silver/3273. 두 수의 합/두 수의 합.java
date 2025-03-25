import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();

        int start = 0, end = N - 1, cnt = 0;
        Arrays.sort(arr);

        while (start != end) {
            int sum = arr[start] + arr[end];
            if (sum > X) end--;
            else if (sum == X) {
                cnt++;
                end--;
            }
            else if (sum < X) start++;
        }
        System.out.println(cnt);
    }
}
