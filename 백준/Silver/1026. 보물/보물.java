import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        for (int j = 0; j < N; j++) {
            B.add(sc.nextInt());
        }

        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A.get(i) * B.get(i);
        }
        System.out.println(sum);
    }
}