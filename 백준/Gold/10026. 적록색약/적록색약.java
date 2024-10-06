import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class Point {
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static int N;
    static char[][] map;
    static boolean[][] visit1;
    static boolean[][] visit2;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        //정상
        int area1 = 0;
        visit1 = new boolean[N][N];
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'R' && !visit1[i][j]) {
                    bfs1(i, j);
                    area1++;
                } else if (map[i][j] == 'G' && !visit1[i][j]) {
                    bfs1(i, j);
                    area1++;
                } else if (map[i][j] == 'B' && !visit1[i][j]) {
                    bfs1(i, j);
                    area1++;
                }
            }
        }
        //적록색약
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'R') {
                    map[i][j] = 'G';
                }
            }
        }
        int area2 = 0;
        visit2 = new boolean[N][N];
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'G' && !visit2[i][j]) {
                    bfs2(i, j);
                    area2++;
                } else if (map[i][j] == 'B' && !visit2[i][j]) {
                    bfs2(i, j);
                    area2++;
                }
            }
        }

        System.out.println(area1 + " " + area2);
    }

    private static void bfs1(int r, int c) {
        Queue<Point> q = new LinkedList<>();
        visit1[r][c] = true;
        q.offer(new Point(r, c));

        while (!q.isEmpty()) {
            Point p = q.poll();
            r = p.r;
            c = p.c;
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (0 > nr || nr >= N || 0 > nc || nc >= N || visit1[nr][nc] || map[r][c] != map[nr][nc]) continue;

                visit1[nr][nc] = true;
                q.offer(new Point(nr, nc));
            }
        }
    }

    private static void bfs2(int r, int c) {
        Queue<Point> q = new LinkedList<>();
        visit2[r][c] = true;
        q.offer(new Point(r, c));

        while (!q.isEmpty()) {
            Point p = q.poll();
            r = p.r;
            c = p.c;
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (0 > nr || nr >= N || 0 > nc || nc >= N || visit2[nr][nc] || map[r][c] != map[nr][nc]) continue;

                visit2[nr][nc] = true;
                q.offer(new Point(nr, nc));
            }
        }
    }
}