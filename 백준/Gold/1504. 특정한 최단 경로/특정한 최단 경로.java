import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }

    static int N, E;
    static List<Node>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N + 1];
        for (int i = 1; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph[a].add(new Node(b, c));
            graph[b].add(new Node(a, c));
        }

        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        // 첫 번째 경우 1 -> v1 -> v2 -> N
        int dist1 = dijkstra(1, v1);
        int dist2 = dijkstra(v1, v2);
        int dist3 = dijkstra(v2, N);
        int total1 = dist1 + dist2 + dist3;
        // 두 번째 경우 1 -> v2 -> v1 -> N
        int dist4 = dijkstra(1, v2);
        int dist5 = dijkstra(v2, v1);
        int dist6 = dijkstra(v1, N);
        int total2 = dist4 + dist5 + dist6;

        if (total1 >= 200_000_000 && total2 >= 200_000_000) {
            System.out.println(-1);
        } else {
            System.out.println(Math.min(total1, total2));
        }

    }

    private static int dijkstra(int start, int end) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, 200_000_000);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node curNode = pq.poll();
            int curVertex = curNode.vertex;

            for (Node node : graph[curVertex]) {
                if (dist[node.vertex] > dist[curVertex] + node.weight) {
                    dist[node.vertex] = dist[curVertex] + node.weight;
                    pq.offer(new Node(node.vertex, dist[node.vertex]));
                }
            }
        }

        return dist[end];
    }
}