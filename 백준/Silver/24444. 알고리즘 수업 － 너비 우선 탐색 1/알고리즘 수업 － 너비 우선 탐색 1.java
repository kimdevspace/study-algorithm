import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M, R;
    static List<Integer>[] adjList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        adjList = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adjList[u].add(v);
            adjList[v].add(u);
        }
        for (int i = 0; i < N + 1; i++) {
            Collections.sort(adjList[i]);
        }

        bfs(R);
    }

    private static void bfs(int start) {
        int[] visit = new int[N + 1];
        visit[start] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        int cnt = 2;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int num : adjList[cur]) {
                if (visit[num] == 0) {
                    visit[num] = cnt++;
                    q.offer(num);
                }
            }
        }
        for (int i = 1; i < N + 1; i++) {
            System.out.println(visit[i]);
        }
    }
}