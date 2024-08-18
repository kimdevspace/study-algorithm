import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    private static int N, M;
    private static int[][] map;
    private static ArrayList<int[]> chicken;
    private static ArrayList<int[]> home;
    private static boolean[] isOpen;
    private static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        input();
        isOpen = new boolean[chicken.size()];
        dfs(0, 0);
        System.out.println(ans);

    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        home = new ArrayList<>();
        chicken = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    home.add(new int[] {i, j});
                }
                else if (map[i][j] == 2) {
                    chicken.add(new int[] {i, j});
                }
            }
        }
    }

    private static void dfs(int idx, int depth) {

        if (depth == M) {
            int chickenDistanceOfCity = 0;
            for (int i = 0; i < home.size(); i++) {
                int chickenDistance = Integer.MAX_VALUE;
                for (int j = 0; j < chicken.size(); j++) {
                    if (isOpen[j]) {
                        int distance = Math.abs(home.get(i)[0] - chicken.get(j)[0]) + Math.abs(home.get(i)[1] - chicken.get(j)[1]);
                        chickenDistance = Math.min(chickenDistance, distance);
                    }
                }
                chickenDistanceOfCity += chickenDistance;
            }
            ans = Math.min(ans, chickenDistanceOfCity);
            return;
        }



        for (int i = idx; i < chicken.size(); i++) {
            isOpen[i] = true;
            dfs(i + 1, depth + 1);
            isOpen[i] = false;
        }
    }
}