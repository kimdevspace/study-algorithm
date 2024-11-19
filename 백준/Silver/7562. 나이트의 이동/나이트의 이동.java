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

    static int T, I, ans;
    static int[][] map;
    static int[][] cnt;
    static int[] dr = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dc = {-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {

            I = Integer.parseInt(br.readLine());
            map = new int[I][I];
            cnt = new int[I][I];
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int endR = Integer.parseInt(st.nextToken());
            int endC = Integer.parseInt(st.nextToken());

            bfs(r, c, endR, endC);
            System.out.println(cnt[endR][endC] - 1);

        }
    }

    private static void bfs(int r, int c, int endR, int endC) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(r, c));
        cnt[r][c] = 1;

        while (!q.isEmpty()) {
            Point p = q.poll();
            int cur_r = p.r;
            int cur_c = p.c;


            for (int i = 0; i < 8; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];

                if (0 > nr || nr >= I || 0 > nc || nc >= I) continue;
                if (cnt[nr][nc] != 0) continue;

                cnt[nr][nc] = cnt[cur_r][cur_c] + 1;
                q.offer(new Point(nr, nc));
            }
        }
    }
}