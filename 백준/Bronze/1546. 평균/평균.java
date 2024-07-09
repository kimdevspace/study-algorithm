import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; // 입력 받을 배열
        double[] ans = new double[N]; // 계산한 값 담을 배열
        double M = 0, avg = 0, sum = 0; // M값(최대), 평균, 핪

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //최댓값 찾기
        for (int i = 0; i < N; i++) {
            if (arr[i] > M) {
                M = arr[i];
            }
        }

        // 계산하여 double형 배열에 담아서 평균 출력
        for (int i = 0; i < N; i++) {
            ans[i] = arr[i] / M * 100;
            sum += ans[i];
        }

        avg = sum / N;

        bw.write(avg + "");
        br.close();
        bw.flush();
        bw.close();

    }
}