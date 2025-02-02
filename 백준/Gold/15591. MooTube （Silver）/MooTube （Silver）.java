import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Node {
        int nextNode;
        int usado;

        public Node(int nextNode, int usado) {
            this.nextNode = nextNode;
            this.usado = usado;
        }
    }

    static int N, Q, V, K, ans;
    static List<Node>[] graph;
    static boolean[] visited;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        graph = new List[N + 1];
        for (int i = 1; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph[u].add(new Node(v, w));
            graph[v].add(new Node(u, w));
        }

        sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());

            bfs(V);
        }

        System.out.println(sb);
    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[N + 1];
        q.offer(v);
        visited[v] = true;
        int cnt = 0;

        while (!q.isEmpty()) {

            int curNode = q.poll();

            for (int i = 0; i < graph[curNode].size(); i++) {
                int nextUsado = graph[curNode].get(i).usado;
                int nextNode = graph[curNode].get(i).nextNode;
                if (nextUsado < K || visited[nextNode]) continue;

                q.add(nextNode);
                visited[nextNode] = true;
                cnt++;
            }
        }

        sb.append(cnt).append('\n');
    }
}