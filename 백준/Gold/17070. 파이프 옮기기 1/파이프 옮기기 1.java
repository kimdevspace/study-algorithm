

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static int[][] map;
    private static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ans = 0;
        dfs(0, 1, 0);
        System.out.println(ans);


    }
    //0 가로, 1 대각, 2 세로
    private static void dfs(int r, int c, int dir) {

        if (r == N - 1&& c == N - 1) {
            ans++;
            return;
        }
        //System.out.println(r+","+c);

        switch (dir) {
            //방향이 우 일 때는 우, 우하 진행이 가능함.
            case 0:
                if (chkRight(r, c)) dfs(r, c + 1, 0);
                if (chkRightDown(r, c)) dfs(r + 1, c + 1, 1);
                break;
            //방향이 우하 일 때는 우하, 우, 하로 가능함.
            case 1:
                if (chkRightDown(r, c)) dfs(r + 1, c + 1, 1);
                if (chkRight(r, c)) dfs(r, c + 1, 0);
                if (chkDown(r, c)) dfs(r + 1, c, 2);
                break;
            //방향이 하 일때는 하, 우하 진행 가능
            case 2:
                if (chkDown(r, c)) dfs(r + 1, c, 2);
                if (chkRightDown(r, c)) dfs(r + 1, c + 1, 1);
                break;

        }
    }

    private static boolean chkDown(int r, int c) {
        if (r + 1 < N && map[r + 1][c] != 1) return true;
        return false;
    }

    private static boolean chkRight(int r, int c) {
        if (c + 1 < N && map[r][c + 1] != 1) return true;
        return false;
    }

    private static boolean chkRightDown(int r, int c) {
        if (r + 1 < N && c + 1 < N && map[r][c + 1] != 1 && map[r + 1][c + 1] != 1 && map[r + 1][c] != 1) {
            return true;
        }
        return false;
    }
}