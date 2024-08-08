import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static StringTokenizer st;
    static int[] people;
    static ArrayList<ArrayList<Integer>> adjList;
    static int ans = Integer.MAX_VALUE;
    static boolean isDiv;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        people = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }


        adjList = new ArrayList<>();
        adjList.add(new ArrayList<Integer>());
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            adjList.add(new ArrayList<Integer>());
            int areaCnt = Integer.parseInt(st.nextToken());
            for (int j = 0; j < areaCnt; j++) {
                int element = Integer.parseInt(st.nextToken());
                adjList.get(i).add(element);
            }
        }
        for (int i = 1; i <= N/2; i++) {
            boolean[] visited = new boolean[N + 1];
            combine(1, i, new ArrayList<>(), visited);
        }
        if (isDiv) System.out.println(ans);
        else System.out.println(-1);

    }
    public static void combine(int start, int maxLen, ArrayList<Integer> groupA, boolean[] visited) {

        if (groupA.size() == maxLen) {
            ArrayList<Integer> groupB = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    groupB.add(i);
                }
            }


            if (isConnected(groupA) && isConnected(groupB)) {
                int A_sum = 0;
                int B_sum = 0;
                for (int i = 0; i < groupA.size(); i++) {
                    A_sum += people[groupA.get(i)];
                }
                for (int i = 0; i < groupB.size(); i++) {
                    B_sum += people[groupB.get(i)];
                }
                ans = Math.min(ans, Math.abs(A_sum - B_sum));
                isDiv = true;
            }
            return;
        }


        for (int i = start; i <= N; i++) {
            visited[i] = true;
            groupA.add(i);
            combine(i + 1, maxLen, groupA, visited);
            groupA.remove(groupA.size() - 1);
            visited[i]= false;
        }
    }

    public static boolean isConnected(ArrayList<Integer> group) {
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(group.get(0));
        visited[group.get(0)] = true;
        int cnt = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int neighbor : adjList.get(cur)) {
                if (group.contains(neighbor) && !visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                    cnt++;
                }
            }
        }
        return cnt == group.size();
    }
}