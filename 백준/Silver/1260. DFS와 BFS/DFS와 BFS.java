import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visit1;
    static boolean[] visit2;
    static int N, M, V;
    static int[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visit1 = new boolean[N + 1];
        visit2 = new boolean[N + 1];
        graph = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        dfs(V);
        System.out.println();
        bfs(V);
    }

    public static void dfs(int v) {
        visit1[v] = true;
        System.out.print(v + " ");
        for (int i = 1; i < N + 1; i++) {
            if (!visit1[i] && graph[v][i] == 1) {
                visit1[i] = true;
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        visit2[v] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");
            for (int i = 1; i < N + 1; i++) {
                if(!visit2[i] && graph[v][i] == 1) {
                    visit2[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}