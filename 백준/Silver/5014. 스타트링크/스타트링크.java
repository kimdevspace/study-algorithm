import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int F, S, G, U, D;
    static int[] visited;
    static Queue<Integer> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        // S -> G
        visited = new int[F + 1];
        q = new ArrayDeque<>();
        visited[S] = 1;
        q.offer(S);

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == G) {
                System.out.println(visited[G] - 1);
                return;
            }

            int[] nextFloor = {cur + U, cur - D};

            for (int next : nextFloor) {
                if (1 <= next && next <= F && visited[next] == 0) {
                    q.offer(next);
                    visited[next] = visited[cur] + 1;
                }
            }

        }

        System.out.println("use the stairs");
    }
}