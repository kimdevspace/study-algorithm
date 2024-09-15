import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int T;
    static int N;
    static int M;
    static int K;
    static int[][] map;
    static boolean[][] visit;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            visit = new boolean[N][M];
            ans = 0;

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
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
        Queue<int[]> q = new LinkedList<>();
        visit[r][c] = true;
        q.offer(new int[] {r, c});

        while (!q.isEmpty()) {
            int[] lst = q.poll();
            r = lst[0];
            c = lst[1];
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (0 <= nr && nr < N && 0 <= nc && nc < M && !visit[nr][nc] && map[nr][nc] == 1) {
                    visit[nr][nc] = true;
                    q.offer(new int[] {nr, nc});
                }
            }
        }
    }
}