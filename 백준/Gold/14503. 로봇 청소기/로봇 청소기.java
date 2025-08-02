import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int N, M, r, c, d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        while (true) {
            // 1. 현재 칸이 청소되지 않은 경우 청소하기
            if (map[r][c] == 0) {
                map[r][c] = -1;
                cnt++;
            }

            // 2. 주변 4칸 중 빈 칸 찾기
            boolean chkEmpty = false;
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (map[nr][nc] == 0) {
                    chkEmpty = true;
                    break;
                }
            }

            // 빈칸이 없는 경우
            if (!chkEmpty) {
                // 방향 유지 후 후진 검증
                int nr = r + dr[(d + 2) % 4];
                int nc = c + dc[(d + 2) % 4];

                if (map[nr][nc] != 1) {
                    r = nr;
                    c = nc;
                } else {
                    break;
                }
            } else { // 빈 칸이 있는 경우
                d = (d + 3) % 4; // 반시계방향으로 회전

                int nr = r + dr[d];
                int nc = c + dc[d];

                // 빈 칸인 경우 전진
                if (map[nr][nc] == 0) {
                    r = nr;
                    c = nc;
                }
            }
        }

        System.out.println(cnt);
    }
}