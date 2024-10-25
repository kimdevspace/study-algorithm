import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        // 소수 판별을 위한 배열 생성 (true가 소수를 의미)
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        
        // 에라토스테네스의 체 알고리즘 적용
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // M 이상 N 이하의 소수를 출력
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
