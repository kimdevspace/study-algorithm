import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<Print> queue = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int value = Integer.parseInt(st.nextToken());
                queue.offer(new Print(j, value));
                pq.offer(value);
            }

            int cnt = 0;
            while (!queue.isEmpty()) {
                Print current = queue.poll();

                // 현재 문서의 중요도가 우선순위 큐의 최대값과 같으면 출력
                if (current.important == pq.peek()) {
                    pq.poll(); // 우선순위 큐에서 제거
                    cnt++;
                    if (current.idx == M) { // 찾던 문서라면
                        System.out.println(cnt);
                        break;
                    }
                } else {
                    queue.offer(current); // 중요도가 낮으면 맨 뒤로 보냄
                }
            }
        }
    }

    static class Print {
        int idx;
        int important;

        public Print(int idx, int important) {
            this.idx = idx;
            this.important = important;
        }
    }
}
