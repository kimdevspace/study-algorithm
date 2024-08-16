import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int N, K;
    private static StringTokenizer st;
    private static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs(N, 0);
        System.out.println(ans);

    }
    public static void bfs(int x, int sec) {
        boolean[] visit = new boolean[100001];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, sec});
        visit[x] = true;

        while (!q.isEmpty()) {
            int[] lst = q.poll();
            int cur = lst[0];
            int depth = lst[1];

            if (cur == K) {
                ans = Math.min(ans, depth);
                break;
            }

            if ((cur - 1) >= 0 && !visit[cur - 1]) {
                q.add(new int[] {cur - 1, depth + 1});
                visit[cur - 1] = true;
            }

            if ((cur + 1) < 100001 && !visit[cur + 1]) {
                q.add(new int[] {cur + 1, depth + 1});
                visit[cur + 1] = true;
            }

            if ((cur * 2) < 100001 && !visit[cur * 2]) {
                q.add(new int[] {cur * 2, depth + 1});
                visit[cur * 2] = true;
            }
        }

    }
}
