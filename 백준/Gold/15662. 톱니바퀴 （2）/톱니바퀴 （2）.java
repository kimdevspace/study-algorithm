import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, K, ans;
    static int[][] wheels;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        wheels = new int[N][8];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < 8; j++) {
                wheels[i][j] = str.charAt(j) - '0';
            }
        }

        K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken()) - 1;
            int dir = Integer.parseInt(st.nextToken());

            rotateLeft(idx - 1, -dir);
            rotateRight(idx + 1, -dir);
            rotate(idx, dir);
        }
        
        ans = 0;
        for (int i = 0; i < N; i++) {
            if (wheels[i][0] == 1) ans++;
        }
        System.out.println(ans);
    }

    private static void rotateLeft(int idx, int dir) {
        if (idx < 0 || wheels[idx][2] == wheels[idx + 1][6]) {
            return;
        }

        rotateLeft(idx - 1, -dir);
        rotate(idx, dir);
    }

    private static void rotateRight(int idx, int dir) {
        if (idx >= N || wheels[idx][6] == wheels[idx - 1][2]) {
            return;
        }

        rotateRight(idx + 1, -dir);
        rotate(idx, dir);
    }

    private static void rotate(int idx, int dir) {
        if (dir == 1) {
            int temp = wheels[idx][7];
            for (int i = 7; i > 0; i--) {
                wheels[idx][i] = wheels[idx][i - 1];
            }
            wheels[idx][0] = temp;
        } else {
            int temp = wheels[idx][0];
            for (int i = 0; i < 7; i++) {
                wheels[idx][i] = wheels[idx][i + 1];
            }
            wheels[idx][7] = temp;
        }
    }
}