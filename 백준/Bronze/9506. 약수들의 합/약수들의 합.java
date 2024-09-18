import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    list.add(n / i);
                }
            }

            Collections.sort(list);
            int sum = 0;
            for (int num : list) {
                sum += num;
            }

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < list.size() - 1; i++) {
                    System.out.print(list.get(i) + " + ");
                }
                System.out.println(list.get(list.size() - 1));
            }else {
                System.out.println(n + " is NOT perfect.");
            }


        }
    }
}