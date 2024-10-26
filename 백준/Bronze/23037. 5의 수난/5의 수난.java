import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - '0';
            sum += (int) Math.pow(a, 5);
        }

        System.out.println(sum);
    }
}