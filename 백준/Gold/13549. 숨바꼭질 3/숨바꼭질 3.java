import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Point implements Comparable<Point> {
        int position;
        int time;

        public Point(int position, int time) {
            this.position = position;
            this.time = time;
        }

        @Override
        public int compareTo(Point o) {
            return this.time - o.time;
        }
    }

    static int N, K, ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        ans = dijkstra(N);
        System.out.println(ans);
    }

    private static int dijkstra(int start) {
        int[] times = new int[100001];
        Arrays.fill(times, 100000000);
        times[start] = 0;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        pq.offer(new Point(start, 0));

        while (!pq.isEmpty()) {
            Point p = pq.poll();
            int curPosition = p.position;
            int curTime = p.time;

            int nextPosition1 = curPosition + 1;
            if (isValid(nextPosition1) && times[nextPosition1] > curTime + 1) {
                times[nextPosition1] = curTime + 1;
                pq.offer(new Point(nextPosition1, times[nextPosition1]));
            }
            int nextPosition2 = curPosition - 1;
            if (isValid(nextPosition2) && times[nextPosition2] > curTime + 1) {
                times[nextPosition2] = curTime + 1;
                pq.offer(new Point(nextPosition2, times[nextPosition2]));
            }
            int nextPosition3 = curPosition * 2;
            if (isValid(nextPosition3) && times[nextPosition3] > curTime) {
                times[nextPosition3] = curTime;
                pq.offer(new Point(nextPosition3, times[nextPosition3]));
            }
        }

        return times[K];
    }

    private static boolean isValid(int num) {
        if (0 <= num && num < 100001) {
            return true;
        }
        return false;
    }
}