import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[][] visit;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visit = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxSize = 0;
        int imgCnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (graph[i][j] == 1 && !visit[i][j]) {
                    maxSize = Math.max(bfs(i, j), maxSize);
                    imgCnt += 1;
                }
            }
        }
        System.out.println(imgCnt);
        System.out.println(maxSize);

    }
    public static int bfs(int r, int c) {
        Queue<int []> q = new LinkedList<>();
        int[] dr = {0, 0, -1, 1};
        int[] dc = {-1, 1, 0, 0};

        int size = 1;
        visit[r][c] = true;
        q.offer(new int[] {r, c});

        while (!q.isEmpty()) {
            int[] lst = q.poll();
            int cur_r = lst[0], cur_c = lst[1];
            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i], nc = cur_c + dc[i];
                if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visit[nr][nc] && graph[nr][nc] == 1) {
                    visit[nr][nc] = true;
                    size += 1;
                    q.offer(new int[] {nr, nc});
                }
            }
        }
        return size;



    }

}