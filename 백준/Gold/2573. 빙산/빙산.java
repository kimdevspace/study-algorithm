import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static class Point {
        int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int year = 0;
        while (true) {

            int[][] melt = new int[N][M];
            for (int i = 1; i < N - 1; i++) {
                for (int j = 1; j < M - 1; j++) {
                    if (map[i][j] != 0) {
                        int seaCnt = 0;
                        for (int k = 0; k < 4; k++) {
                            int nr = i + dr[k];
                            int nc = j + dc[k];
                            if (map[nr][nc] == 0) {
                                seaCnt++;
                            }
                        }
                        melt[i][j] = seaCnt;
                    }
                }
            }

            for (int i = 1; i < N - 1; i++) {
                for (int j = 1; j < M - 1; j++) {
                    map[i][j] = Math.max(0, map[i][j] - melt[i][j]);
                }
            }
            year++;

            boolean zeroChk = true;

            for (int i = 1; i < N - 1; i++) {
                for (int j = 1; j < M - 1; j++) {
                    if (map[i][j] != 0) {
                        zeroChk = false;
                    }
                }
            }

            if (zeroChk) {
                System.out.println(0);
                break;
            }

            visited = new boolean[N][M];
            int area = 0;
            for (int i = 1; i < N - 1; i++) {
                for (int j = 1; j < M - 1; j++) {
                    if (map[i][j] != 0 && !visited[i][j]) {
                        bfs(i, j);
                        area++;
                    }
                }
            }

            if (area >= 2) {
                System.out.println(year);
                break;
            }
        }
    }

    private static void bfs(int r, int c) {
        Queue<Point> q = new ArrayDeque<>();
        visited[r][c] = true;
        q.offer(new Point(r, c));

        while (!q.isEmpty()) {
            Point point = q.poll();

            int cur_r = point.r;
            int cur_c = point.c;

            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];

                if (1 <= nr && nr < N - 1 && 1 <= nc && nc < M - 1 && !visited[nr][nc] && map[nr][nc] != 0) {
                    q.offer(new Point(nr, nc));
                    visited[nr][nc] = true;
                }
            }
        }
    }
}