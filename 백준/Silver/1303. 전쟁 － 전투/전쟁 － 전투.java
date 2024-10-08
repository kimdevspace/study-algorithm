import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static char[][] map;
    static int white, blue;
    static boolean[][] visit;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[M][N];
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        visit = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'W' && !visit[i][j]) {
                    white += (int) Math.pow(bfs(i,j),2);
                }
                else if (map[i][j] == 'B' && !visit[i][j]) {
                    blue += (int) Math.pow(bfs(i,j),2);
                }
            }
        }

        System.out.println(white);
        System.out.println(blue);
    }
    public static int bfs(int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        visit[r][c] = true;
        q.add(new int[] {r,c});
        int cnt = 1;

        while (!q.isEmpty()) {
            int[] lst = q.poll();
            int cur_r = lst[0], cur_c = lst[1];
            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i], nc = cur_c + dc[i];
                if (nr >= 0 && nc >= 0 && nr < M && nc < N && map[cur_r][cur_c] == map[nr][nc] && !visit[nr][nc]) {
                    q.add(new int[] {nr, nc});
                    visit[nr][nc] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}