import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static class Point {
        int h, r, c;

        public Point(int h, int r, int c) {
            this.h = h;
            this.r = r;
            this.c = c;
        }
    }

    static int N, M, H;
    static int[][][] box;
    static int[][][] day;
    static int[] dr = {-1, 1, 0, 0, 0, 0};
    static int[] dc = {0, 0, -1, 1, 0, 0};
    static int[] dh = {0, 0, 0, 0, -1, 1};
    static Queue<Point> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[H][N][M];
        day = new int[H][N][M];
        q = new ArrayDeque<>();

        boolean chkZero = true;
        for (int h = 0; h < H; h++) {
            for (int r = 0; r < N; r++) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < M; c++) {
                    box[h][r][c] = Integer.parseInt(st.nextToken());
                    if (box[h][r][c] == 1) {
                        q.offer(new Point(h, r, c));
                    }

                    if (box[h][r][c] == 0) {
                        chkZero = false;
                    }
                }
            }
        }

        if (chkZero) {
            System.out.println(0);
        } else {
            int ans = bfs();
            if (checkBox()) {
                System.out.println(ans);
            } else {
                System.out.println(-1);
            }
        }
    }

    private static int bfs() {
        int max = 0;

        while (!q.isEmpty()) {
            Point point = q.poll();
            int cur_h = point.h;
            int cur_r = point.r;
            int cur_c = point.c;

            for (int i = 0; i < 6; i++) {
                int nh = cur_h + dh[i];
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];

                if (0 <= nh && nh < H && 0 <= nr && nr < N && 0 <= nc && nc < M && box[nh][nr][nc] == 0 && day[nh][nr][nc] == 0) {
                    q.offer(new Point(nh, nr, nc));
                    box[nh][nr][nc] = 1;
                    day[nh][nr][nc] = day[cur_h][cur_r][cur_c] + 1;
                    max = Math.max(max, day[nh][nr][nc]);
                }
            }
        }

        return max;
    }


    private static boolean checkBox() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}