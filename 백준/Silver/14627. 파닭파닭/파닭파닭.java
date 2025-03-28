import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int S, C;
    static long left, right, leek, ans;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new int[S];
        left = 1;
        right = 0;
        
        // 모든 파의 길이를 입력받고 가장 긴 파의 길이를 right로 설정
        for (int i = 0; i < S; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, arr[i]);
        }

        // 이분 탐색으로 최대 파의 길이 찾기
        leek = 0;
        while (left <= right) {
            long mid = (left + right) / 2;

            long sum = 0;
            for (int i = 0; i < S; i++) {
                sum += arr[i] / mid;
            }

            if (sum >= C) {
                leek = Math.max(leek, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 전체 파의 길이 계산
        long totalLength = 0;
        for (int i = 0; i < S; i++) {
            totalLength += arr[i];
        }

        // 파닭에 사용된 파의 길이
        long usedForChicken = C * leek;

        // 라볶이에 사용될 남은 파의 길이
        ans = totalLength - usedForChicken;

        System.out.println(ans);
    }
}