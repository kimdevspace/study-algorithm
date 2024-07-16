import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = str.charAt(i) - 96;
        }
        int M = 1234567891;
        long pow = 1;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum += (arr[i] * pow) % M;
            pow = 31 * pow % M;
        }
        System.out.println(sum % M);
    }
}