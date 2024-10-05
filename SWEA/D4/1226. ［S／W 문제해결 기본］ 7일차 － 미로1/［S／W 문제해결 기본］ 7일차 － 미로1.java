import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    static class Point {
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static int T;
    static int[][] map = new int[16][16];
    static boolean[][] visit;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {

            int start_r = 0, start_c = 0;
            int end_r = 0, end_c = 0;

            T = Integer.parseInt(br.readLine());
            for (int i = 0; i < 16; i++) {
                String str = br.readLine();
                for (int j = 0; j < 16; j++) {
                    map[i][j] = str.charAt(j) - '0';
                    if (map[i][j] == 2) {
                        start_r = i;
                        start_c = j;
                    } else if (map[i][j] == 3) {
                        end_r = i;
                        end_c = j;
                    }
                }
            }

            bfs(start_r, start_c);
            sb.append("#").append(tc).append(" ");
            if (visit[end_r][end_c]) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static void bfs(int r, int c) {
        visit = new boolean[16][16];
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(r, c));
        visit[r][c] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();
            r = p.r;
            c = p.c;
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (0 > nr || nr >= 16 || 0 > nc || nc >= 16 || visit[nr][nc] || map[nr][nc] == 1) continue;

                visit[nr][nc] = true;
                q.offer(new Point(nr, nc));
            }
        }
    }
}