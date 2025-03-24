import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0, right = 0, sum = 0, count = 0;

        while (right < N || sum >= M) {  // 종료 조건 수정
            if (sum < M && right < N) {  // 오른쪽 포인터 확장
                sum += A[right++];
            } else {  // 왼쪽 포인터 이동
                sum -= A[left++];
            }

            if (sum == M) count++;  // sum이 M과 같아지는 순간 체크
        }

        System.out.println(count);
    }
}
