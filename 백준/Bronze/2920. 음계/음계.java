import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        String res = "";

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) res = "ascending";
            else if (arr[i] == arr[i + 1] + 1) res = "descending";
            else {
                res = "mixed";
                break;
            }
        }
        System.out.println(res);
    }
}