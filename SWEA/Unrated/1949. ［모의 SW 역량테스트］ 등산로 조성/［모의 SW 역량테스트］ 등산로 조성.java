import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
1. 모든 좌표값 리스트에 담기. 한 좌표마다 K번까지 등산로를 깎을 수 있느 모든 경우의 수 고려하기 위해
2. 좌표를 하나씩 꺼내서 k번 깎는 동안의 모든 경우의수 dfs
3. 경로 최댓값 갱신하기
 */
public class Solution {

    private static int T, N, K, ans;
    private static int[][] map;
    private static int[][] copyMap;
    private static boolean[][] visit;
    private static int[] dr = {-1, 1, 0, 0};
    private static int[] dc = {0, 0, -1, 1};
    private static ArrayList<int[]> arr;
    private static int maxHeight, maxLength;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {

            //입력 받기, 모든 좌표 리스트로 관리
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new int[N][N];
            copyMap = new int[N][N]; //복사할 맵
            arr = new ArrayList<>(); // 모든 좌표 담을 리스트
            maxHeight = 0;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    int value = Integer.parseInt(st.nextToken());
                    maxHeight = Math.max(maxHeight, value);
                    map[i][j] = value;
                    copyMap[i][j] = value;
                    arr.add(new int[] {i, j});
                }
            }
            ans = 0;
            solution();
            sb.append("#").append(tc).append(" ").append(ans).append("\n");

        }
        System.out.println(sb);
    }

    private static void solution() {

        for (int i = 0; i < arr.size(); i++) {
            int ti = arr.get(i)[0];
            int tj = arr.get(i)[1];
            copyMap();

            for (int j = 0; j < K; j++) {
                if (map[ti][tj] == 0) continue;
                map[ti][tj] -= 1; //해당 좌표를 k 번동안 깎으면서

                // 최댓값에서 dfs 돌기 (경로 최대 갱신)
                for (int si = 0; si < N; si++) {
                    for (int sj = 0; sj < N; sj++) {
                        if (map[si][sj] == maxHeight) {

                            visit = new boolean[N][N];
                            maxLength = 0;
                            dfs(si, sj, 1);
                            ans = Math.max(ans, maxLength);

                        }
                    }
                }

            }
        }
    }

    private static void dfs(int r, int c, int dist) {

        if (0 > r || r >= N || 0 > c || c >= N) {
            return;
        }

        if (visit[r][c]) {
            return;
        }
        visit[r][c] = true;
        maxLength = Math.max(maxLength, dist);

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (0 <= nr && nr < N && 0 <= nc && nc < N && !visit[nr][nc]) {
                if (map[nr][nc] < map[r][c]) {
                    dfs(nr, nc, dist + 1);
                }
            }

        }
        visit[r][c] = false; //백트래킹
    }

    private static void copyMap() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = copyMap[i][j];
            }
        }
    }
}