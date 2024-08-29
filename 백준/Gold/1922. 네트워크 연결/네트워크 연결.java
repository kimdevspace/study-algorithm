import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int N; //컴퓨터의 수
    private static int M; //최대 간선의 수
    private static int[] p; //서로소 집합
    private static int[][] graph; //연결 정보를 담을 거
    private static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new int[M][3];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //가중치 기준으로 오름차순 정렬
        Arrays.sort(graph, (o1, o2) -> o1[2] - o2[2]);
        makeSet();
        System.out.println(kruskal());


    }
    private static void makeSet() {
        p = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            p[i] = i;
        }
    }

    private static int find(int x) {
        if (x == p[x]) {
            return x;
        }
        return p[x] = find(p[x]);
    }

    private static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x < y) {
            p[y] = x;
        }else {
            p[x] = y;
        }
    }

    private static int kruskal() {
        int cost = 0;
        for (int i = 0; i < graph.length; i++) {
            if (find(graph[i][0]) != find(graph[i][1])) {
                cost += graph[i][2];
                union(find(graph[i][0]), find(graph[i][1]));
            }
        }
        return cost;
    }
}