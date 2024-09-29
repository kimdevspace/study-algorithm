import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static List<List<Integer>> adjList;

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        adjList = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adjList.get(x).add(y);
            adjList.get(y).add(x);
        }
    }

    private static void solution() {
        bfs();
    }
    private static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[N + 1];
        int[] parent = new int[N + 1];
        q.offer(1);
        visit[1] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int v : adjList.get(cur)) {
                if (visit[v]) continue;

                visit[v] = true;
                q.offer(v);
                parent[v] = cur;
            }
        }

        for (int i = 2; i < N + 1; i++) {
            System.out.println(parent[i]);
        }
    }
}