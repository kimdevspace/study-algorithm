import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Point implements Comparable<Point> {
        int r;
        int c;
        int count;

        public Point(int r, int c, int count) {
            this.r = r;
            this.c = c;
            this.count = count;
        }

        @Override
        public int compareTo(Point o) {
            return this.count - o.count;
        }
    }

    static int N, M, ans;
    static int[][] map;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        dijkstra(0, 0);
    }

    private static void dijkstra(int r, int c) {
        int[][] cnt = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(cnt[i], Integer.MAX_VALUE);
        }

        PriorityQueue<Point> pq = new PriorityQueue<>();
        pq.offer(new Point(r, c, map[r][c]));
        cnt[r][c] = 0;

        while (!pq.isEmpty()) {
            Point p = pq.poll();

            int cur_r = p.r;
            int cur_c = p.c;
            int cur_count = p.count;

            if (cur_r == N - 1 && cur_c == M - 1) break;

            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];

                if (0 > nr || nr >= N || 0 > nc || nc >= M) continue;

                if (cnt[nr][nc] > map[nr][nc] + cur_count) {
                    cnt[nr][nc] = map[nr][nc] + cur_count;
                    pq.offer(new Point(nr, nc, cur_count + map[nr][nc]));
                }
            }
        }

        System.out.println(cnt[N - 1][M - 1]);
    }
}