import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M, num1, num2;
    static List<Integer>[] family;
    static int[] depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());

        family = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            family[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            family[a].add(b);
            family[b].add(a);
        }

        depth = new int[N + 1];
        bfs(num1);
        if (depth[num2] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(depth[num2]);
        }
    }

    private static void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i : family[cur]) {
                if (depth[i] == 0) {
                    q.offer(i);
                    depth[i] = depth[cur] + 1;
                }
            }
        }
    }
}