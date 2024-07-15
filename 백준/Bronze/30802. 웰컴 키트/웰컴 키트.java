import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[6];
        
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        
        int T = sc.nextInt();
        int P = sc.nextInt();
        
        sc.close();
        
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += arr[i] / T;
            if (arr[i] % T != 0) sum++;
        }
        System.out.println(sum);
        System.out.println((N / P) + " " + (N % P));
    }
}