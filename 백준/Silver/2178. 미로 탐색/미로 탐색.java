import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        bfs();
        System.out.println(arr[N-1][M-1]);

    }
    public static void bfs() {
        int[] dr = {0,0,-1,1};
        int[] dc = {1,-1,0,0};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0 ,0});

        while (!q.isEmpty()) {
            int[] lst = q.poll();
            int cur_r = lst[0], cur_c = lst[1];
            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];
                if (nr >= 0 && nr < N && nc >= 0 && nc < M && arr[nr][nc] == 1) {
                    arr[nr][nc] = arr[cur_r][cur_c] + 1;
                    q.offer(new int[] {nr,nc});
                }
            }
        }
    }
}