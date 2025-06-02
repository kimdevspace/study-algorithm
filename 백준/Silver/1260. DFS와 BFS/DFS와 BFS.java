import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M, V;
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 정점 수
        M = Integer.parseInt(st.nextToken()); // 간선 수
        V = Integer.parseInt(st.nextToken()); // 탐색 시작 지점

        // 그래프 초기화
        graph = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        // 연결 입력하기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }
        
        for (int i = 1; i < N + 1; i++) {
            Collections.sort(graph[i]);
        }

        // DFS 탐색 시작
        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();
        // BFS 탐색 시작
        visited = new boolean[N + 1];
        bfs(V);
    }

    // DFS
    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i : graph[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    // BFS
    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.offer(v);

        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");
            for (int i : graph[v]) {
                if (!visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}