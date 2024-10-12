import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static class Point {
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static int w, h;
    static int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int[][] map;
    static boolean[][] visit;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            ans = 0;
            map = new int[h][w];
            visit = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visit[i][j] && map[i][j] == 1) {
                        bfs(i, j);
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }
    }

    private static void bfs(int r, int c) {
        Queue<Point> q = new LinkedList<>();
        visit[r][c] = true;
        q.offer(new Point(r, c));

        while (!q.isEmpty()) {
            Point p = q.poll();
            r = p.r;
            c = p.c;
            for (int i = 0; i < 8; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (0 > nr || nr >= h || 0 > nc || nc >= w || map[nr][nc] != 1 || visit[nr][nc]) continue;

                visit[nr][nc] = true;
                q.offer(new Point(nr, nc));
            }
        }
    }
}