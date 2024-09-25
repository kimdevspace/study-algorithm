import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //인접리스트만들기
        ArrayList<Integer>[] adjList = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            adjList[i] = new ArrayList<>();
        }

        //간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adjList[x].add(y);
            adjList[y].add(x);
        }
        
        //dfs 시작
        int cnt = 0;
        boolean[] visit = new boolean[N + 1];
        for (int i = 1; i < N + 1; i++) {
            if (!visit[i]) {
                dfs(i, visit, adjList);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static void dfs(int v, boolean[] visit, ArrayList<Integer>[] adjList) {
        visit[v] = true;
        for (int num : adjList[v]) {
            if (!visit[num]) {
                dfs(num, visit, adjList);
            }
        }
    }
}