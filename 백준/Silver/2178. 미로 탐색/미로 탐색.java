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
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        System.out.println(map[N - 1][M - 1]);
    }

    private static void bfs(int r, int c) {
        Queue<Point> q = new ArrayDeque<>();
        q.offer(new Point(r, c));
        visited[r][c] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();

            int cur_r = p.r;
            int cur_c = p.c;

            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];

                if (0 <= nr && nr < N && 0 <= nc && nc < M && !visited[nr][nc] && map[nr][nc] != 0) {
                    q.offer(new Point(nr, nc));
                    visited[nr][nc] = true;
                    map[nr][nc] = map[cur_r][cur_c] + 1;
                }
            }
        }
    }
}