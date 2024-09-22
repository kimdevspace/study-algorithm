import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, M, ans;
    static int[][] graph;
    static int[] p;
    static ArrayList<Integer> edgeCost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[M + 1][3];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        edgeCost = new ArrayList<>();
        Arrays.sort(graph, (o1, o2) -> o1[2] - o2[2]);
        makeSet();
        kruskal();

        ans = 0;
        for (int i = 0; i < edgeCost.size() - 1; i++) {
            ans += edgeCost.get(i);
        }
        System.out.println(ans);
    }

    private static void makeSet() {
        p = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            p[i] = i;
        }
    }

    private static int find(int x) {
        if (p[x] == x) return x;
        return p[x] = find(p[x]);
    }

    private static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) return;

        if (rootX < rootY) {
            p[rootY] = rootX;
        }else {
            p[rootX] = rootY;
        }
    }

    private static void kruskal() {
        for (int i = 0; i < graph.length; i++) {
            if (find(graph[i][0]) != find(graph[i][1])) {
                edgeCost.add(graph[i][2]);
                union(find(graph[i][0]), find(graph[i][1]));
            }
        }
    }
}