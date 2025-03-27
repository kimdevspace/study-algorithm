import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Point {
        int r, c;
        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static class State {
        Point coin1, coin2;
        int count;
        public State(Point coin1, Point coin2, int count) {
            this.coin1 = coin1;
            this.coin2 = coin2;
            this.count = count;
        }
    }
    static int N, M, ans;
    static char[][] board;
    static boolean[][][][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static List<Point> coins;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // input
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new char[N][M];
        coins = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = str.charAt(j);
                if (board[i][j] == 'o') coins.add(new Point(i, j));
            }
        }
        Point coin1 = coins.get(0);
        Point coin2 = coins.get(1);

        // solution
        ans = bfs(coin1, coin2);
        System.out.println(ans);
    }

    private static int bfs(Point coin1, Point coin2) {
        Queue<State> q = new LinkedList<>();
        visited = new boolean[N][M][N][M];
        q.add(new State(coin1, coin2, 0));
        visited[coin1.r][coin1.c][coin2.r][coin2.c] = true;

        while (!q.isEmpty()) {

            State state = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr1 = state.coin1.r + dr[i];
                int nc1 = state.coin1.c + dc[i];
                int nr2 = state.coin2.r + dr[i];
                int nc2 = state.coin2.c + dc[i];

                boolean out1 = 0 > nr1 || nr1 >= N || 0 > nc1 || nc1 >= M;
                boolean out2 = 0 > nr2 || nr2 >= N || 0 > nc2 || nc2 >= M;

                if (out1 && out2) continue;
                if (out1 || out2) {
                    return state.count + 1;
                }

                if (0 <= nr1 && nr1 < N && 0 <= nc1 && nc1 < M && board[nr1][nc1] == '#') {
                    nr1 = state.coin1.r;
                    nc1 = state.coin1.c;
                }

                if (0 <= nr2 && nr2 < N && 0 <= nc2 && nc2 < M && board[nr2][nc2] == '#') {
                    nr2 = state.coin2.r;
                    nc2 = state.coin2.c;
                }

                if (!visited[nr1][nc1][nr2][nc2]) {
                    visited[nr1][nc1][nr2][nc2] = true;
                    q.add(new State(new Point(nr1, nc1), new Point(nr2, nc2), state.count + 1));
                }
            }
        }

        return -1;
    }
}