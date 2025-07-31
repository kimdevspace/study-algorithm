import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Point {
        int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static int T, N;
    static List<Point> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            N = Integer.parseInt(br.readLine());
            graph = new ArrayList<>();
            
            st = new StringTokenizer(br.readLine());
            graph.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                graph.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }

            st = new StringTokenizer(br.readLine());
            graph.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));

            boolean canGo = bfs(0, graph.size() - 1);

            if (canGo) {
                System.out.println("happy");
            } else {
                System.out.println("sad");
            }
        }
    }

    private static boolean bfs(int start, int end) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[graph.size()];

        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == end) {
                return true;
            }

            for (int next = 0; next < graph.size(); next++) {
                if (!visited[next]) {
                    int distance = getDistance(graph.get(cur), graph.get(next));

                    if (distance <= 1000) {
                        q.offer(next);
                        visited[next] = true;
                    }
                }
            }
        }

        return false;
    }

    private static int getDistance(Point p1, Point p2) {
        return Math.abs(p2.r - p1.r) + Math.abs(p2.c - p1.c);
    }
}