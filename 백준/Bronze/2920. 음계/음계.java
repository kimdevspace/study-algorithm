import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        int[] check = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            check[i] = arr[i];
        }

        Arrays.sort(check);

        if (Arrays.equals(arr, check)) {
            System.out.println("ascending");
        } else {
            for (int i = 0; i < check.length / 2; i++) {
                int temp = check[i];
                check[i] = check[check.length - 1 - i];
                check[check.length - 1 - i] = temp;
            }

            if (Arrays.equals(arr, check)) {
                System.out.println("descending");
            } else {
                System.out.println("mixed");
            }
        }
    }
}