import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static Queue<Integer> q;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        q = new ArrayDeque<>();
        visited = new int[100001];

        q.offer(N);
        visited[N] = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == K) {
                System.out.println(visited[cur] - 1);
                break;
            }
            
            int[] next = {cur - 1, cur + 1, cur * 2};

            for (int nextPos : next) {
                if (nextPos >= 0 && nextPos < 100001 && visited[nextPos] == 0) {
                    q.offer(nextPos);
                    visited[nextPos] = visited[cur] + 1;
                }
            }
        }

    }
}