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

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static List<Integer> counts;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        visited = new boolean[N][N];
        counts = new ArrayList<>(70);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    counts.add(bfs(i, j));
                }
            }
        }

        Collections.sort(counts);
        
        System.out.println(counts.size());
        for (int i : counts) {
            System.out.println(i);
        }
    }

    private static int bfs(int r, int c) {
        Queue<Point> q = new ArrayDeque<>();
        q.offer(new Point(r, c));
        visited[r][c] = true;
        int cnt = 1;

        while (!q.isEmpty()) {
            Point point = q.poll();

            int cur_r = point.r;
            int cur_c = point.c;

            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];

                if (0 <= nr && nr < N && 0 <= nc && nc < N && !visited[nr][nc] && map[nr][nc] == 1) {
                    q.offer(new Point(nr, nc));
                    visited[nr][nc] = true;
                    cnt++;
                }
            }
        }

        return cnt;
    }
}