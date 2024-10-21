import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        while(true) {
            int N = sc.nextInt();
            if (N == -1) {
                break;
            }
            sum += N;
        }
        
        System.out.println(sum);
    }
}