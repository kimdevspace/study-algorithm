import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class Node {
        int next;
        int dist;

        public Node(int next, int dist) {
            this.next = next;
            this.dist = dist;
        }
    }

    static int N, K, ans;
    static List<Node>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

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

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            visited = new boolean[N + 1];
            ans = -1;

            dfs(start, end, 0);

            System.out.println(ans);
        }
    }

    private static void dfs(int start, int end, int total) {
        if (start == end) {
            ans = total;
            return;
        }

        visited[start] = true;

        for (Node nextNode : graph[start]) {
            if (!visited[nextNode.next]) {
                dfs(nextNode.next, end, total + nextNode.dist);
            }
        }
    }
}