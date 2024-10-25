import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄에서 N을 읽고 공백을 기준으로 분리
        int N = Integer.parseInt(br.readLine());
        
        // 점수 배열 입력 받기
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        
        // 점수 정렬
        Arrays.sort(scores);
        
        // 절사할 개수 (15%)
        int trimCount = (int) Math.round(N * 0.15);
        
        // 절사된 중앙 점수의 합 구하기
        int sum = 0;
        int count = 0;
        for (int i = trimCount; i < N - trimCount; i++) {
            sum += scores[i];
            count++;
        }
        
        // 절사 평균 계산
        double average = (double) sum / count;
        
        // 반올림하여 정수 출력
        System.out.println((int) Math.round(average));
    }
}
