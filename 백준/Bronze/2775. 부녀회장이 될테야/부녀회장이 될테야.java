import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[k + 1][n + 1];

            // 0층 i호 i명으로 채우기
            for (int i = 1; i < n + 1; i++) {
                arr[0][i] = i;
            }

            // dp --- 현재 호수 인원은 이전 방 호수 인원 + 밑 층 방 호수 인원 dp로진행
            for (int i = 1; i < k + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
                }
            }
            System.out.println(arr[k][n]);
        }
        sc.close();
    }
}