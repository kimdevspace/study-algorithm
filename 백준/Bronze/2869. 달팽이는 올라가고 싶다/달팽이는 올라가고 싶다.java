import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int res = 0;
        if (A > V) {
            System.out.println(1);
        }
        else {
            if ((V - A) % (A - B) == 0) {
                System.out.println((V - A) / (A - B) + 1);
            }
            else {
                System.out.println((V - A) / (A - B) + 2);
            }
        }
    }
}