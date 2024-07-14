import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int cnt = 0;
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}