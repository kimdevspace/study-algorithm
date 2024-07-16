import java.util.Arrays;
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

        int H = 0;
        for (int i = 0; i < N; i++) {
            H += arr[i] * Math.pow(31, i);
        }
        System.out.println(H);
    }
}