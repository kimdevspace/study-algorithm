import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M, V;
    static List<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        visited = new boolean[N + 1];
        sb = new StringBuilder();
        dfs(V);

        sb.append("\n");

        visited = new boolean[N + 1];
        bfs(V);

        System.out.println(sb);
    }

    private static void dfs(int v) {
        visited[v] = true;
        sb.append(v + " ");

        for (int i : graph[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            int current = q.poll();

            sb.append(current + " ");

            for (int i : graph[current]) {
                if (!visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}