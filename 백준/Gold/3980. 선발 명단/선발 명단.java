import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 모든 경우의 수를 탐색하는 문제이다.
 * 현재 행에서 고른 포지션은 다음 행에서 고르면 안됨!. 그리고 0은 그냥 무시하기
 */
public class Main {

    static int[][] position;
    static boolean[] visited;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            position = new int[11][11];
            for (int i = 0; i < 11; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 11; j++) {
                    position[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            visited = new boolean[11];
            ans = 0;
            backTracking(0, 0);
            System.out.println(ans);
        }
    }

    private static void backTracking(int pos, int total) {
        if (pos == 11) {
            ans = Math.max(ans, total);
            return;
        }

        for (int i = 0; i < 11; i++) {
            if (!visited[i] && position[pos][i] != 0) {
                visited[i] = true;
                backTracking(pos + 1, total + position[pos][i]);
                visited[i] = false;
            }
        }
    }
}