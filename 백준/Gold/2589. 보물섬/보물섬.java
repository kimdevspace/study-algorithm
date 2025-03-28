import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Point {
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static char[][] map;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int N, M, ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'L') {
                    bfs(i, j);
                }
            }
        }

        System.out.println(ans);
    }



    private static void bfs(int r, int c) {
        Queue<Point> q = new ArrayDeque<>();
        int[][] visited = new int[N][M];
        q.offer(new Point(r, c));
        visited[r][c] = 1;

        while (!q.isEmpty()) {
            Point p = q.poll();
            r = p.r;
            c = p.c;

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (0 > nr || nr >= N || 0 > nc || nc >= M || visited[nr][nc] > 0 || map[nr][nc] == 'W') continue;

                q.offer(new Point(nr, nc));
                visited[nr][nc] = visited[r][c] + 1;
                ans = Math.max(ans, visited[nr][nc] - 1);
            }
        }
    }
}