import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        List<Integer>[] adjList = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adjList[a].add(b);
            adjList[b].add(a);
        }

        for (int i = 1; i < N + 1; i++) {
            Collections.sort(adjList[i]);
        }

        int[] visit = new int[N + 1];
        count = 1;
        dfs(R, visit, adjList);

        for (int i = 1; i < N + 1; i++) {
            System.out.println(visit[i]);
        }

    }
    private static void dfs(int v, int[] visit, List<Integer>[] adjList) {
        visit[v] = count;

        for (int cur : adjList[v]) {
            if (visit[cur] == 0) {
                count++;
                dfs(cur, visit, adjList);
            }
        }

    }
}