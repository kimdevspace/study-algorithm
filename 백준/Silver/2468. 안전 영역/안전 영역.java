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

        @Override
        public String toString() {
            return "Point{" +
                    "r=" + r +
                    ", c=" + c +
                    '}';
        }
    }

    static int N, maxHeight, ans;
    static int[][] map;
    static boolean[][] visited;
    static Queue<Point> q;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        maxHeight = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, map[i][j]);
            }
        }

        ans = 0;

        for (int i = 0; i <= maxHeight; i++) {

            q = new ArrayDeque<>();
            visited = new boolean[N][N];
            int max = 0;

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (map[r][c] > i && !visited[r][c]) {
                        bfs(r, c, i);
                        max++;
                    }
                }
            }
            ans = Math.max(ans, max);
        }

        System.out.println(ans);
    }

    private static void bfs(int r, int c, int rainHeight) {
        q.offer(new Point(r, c));
        visited[r][c] = true;

        while (!q.isEmpty()) {
            Point point = q.poll();

            int cur_r = point.r;
            int cur_c = point.c;

            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];

                if (0 <= nr && nr < N && 0 <= nc && nc < N && !visited[nr][nc] && map[nr][nc] > rainHeight) {
                    q.offer(new Point(nr, nc));
                    visited[nr][nc] = true;
                }
            }
        }
    }
}