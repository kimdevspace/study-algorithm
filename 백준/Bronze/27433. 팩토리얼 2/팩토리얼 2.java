import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(factorial(N));
    }

    private static long factorial(int N) {
        if (N == 0) return 1;
        return factorial(N - 1) * N;
    }
}