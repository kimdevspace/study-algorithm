import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 계수정렬############
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];
        // arr 배열 받기
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            cnt[arr[i]]++;
        }

       
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}