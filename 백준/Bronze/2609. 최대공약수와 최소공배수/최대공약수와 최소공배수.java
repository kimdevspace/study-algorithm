import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int res1 = 0;
        int res2 = 0;

        int range = 0;
        if (A > B) {
            range = B;
        }
        else {
            range = A;
        }

        //최대 공약수
        for (int i = 1; i <= range; i++) {
            if (A % i == 0 && B % i ==0) {
                res1 = i;
            }
        }
        //최소 공배수 : 두 정수의 곱을 최대 공약수로 나누어 주면 됨.
        res2 = (A * B) / res1;

        System.out.println(res1);
        System.out.println(res2);
    }
}