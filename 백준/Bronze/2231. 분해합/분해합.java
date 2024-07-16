import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean chk = false;
        for (int i = 1; i <= n; i++) {
            String str = Integer.toString(i);
            char[] arr = new char[str.length()];
            for (int j = 0; j < str.length(); j++) {
                arr[j] = str.charAt(j);
            }

            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j] - '0';
            }


            if (sum + i == n) {
                System.out.println(i);
                chk = true;
                break;
            }

        }
        if (chk == false) {
            System.out.println(0);
        }
    }
}