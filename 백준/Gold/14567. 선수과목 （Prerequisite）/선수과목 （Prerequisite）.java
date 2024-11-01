import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M, ans;
    static List<Integer>[] adjList;
    static int[] enterDegree;
    static int[] semester;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        enterDegree = new int[N + 1];
        semester = new int[N + 1];
        Arrays.fill(semester, 1);

        adjList = new ArrayList[N + 1];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            adjList[A].add(B);
            enterDegree[B]++;
        }

        topologicalSort();

        for (int i = 1; i < semester.length; i++) {
            System.out.print(semester[i] + " ");
        }
    }

    private static void topologicalSort() {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < enterDegree.length; i++) {
            if (enterDegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int curNode = q.poll();
            for (int nextNode : adjList[curNode]) {
                semester[nextNode] = Math.max(semester[nextNode], semester[curNode] + 1);
                if (--enterDegree[nextNode] == 0) {
                    q.offer(nextNode);
                }
            }
        }
    }
}