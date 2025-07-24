import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M;
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        M = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        System.out.println(bfs(1));
    }

    private static int bfs(int v) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(v);
        visited[v] = true;
        int cnt = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i : graph[cur]) {
                if (!visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }

        return cnt;
    }
}