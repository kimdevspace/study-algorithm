import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt = 0;
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        combination(0,0);
        System.out.println(cnt);
    }

    public static void combination(int idx, int depth) {
        if (depth == K) {
            cnt += 1;
            return;
        }
        for (int i = idx; i < N; i++) {
            combination(i + 1,depth + 1);
        }
    }
}