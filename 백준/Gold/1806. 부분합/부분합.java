import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, S, ans;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ans = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int total = 0;
        
        while (end < N) {
            while (end < N && total < S) {
                total += arr[end++];
            }
            
            while (total >= S) {
                ans = Math.min(ans, end - start);
                total -= arr[start++];
            }
        }
        
        if (ans == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(ans);
    }
}