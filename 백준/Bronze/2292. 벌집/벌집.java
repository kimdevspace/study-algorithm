import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        int num = 1;
        if (N == 1 ) {
            System.out.println(1);
        }
        else {
            while (true) {
                if (N <= num) {
                    System.out.println(i);
                    break;
                }
                num += (i * 6);
                i++;

            }

        }
    }
}