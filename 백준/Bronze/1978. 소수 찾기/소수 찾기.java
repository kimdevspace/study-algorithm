import java.util.Scanner;

public class Main {

    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            isPrime(arr[i]);
        }

        System.out.println(ans);

    }

    public static void isPrime(int n) {
        if (n < 2) {
            ans += 0;
            return;
        }
        else if (n == 2) {
            ans += 1;
            return;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ans += 0;
                return;
            }
        }
        ans += 1;
        return;
    }
}