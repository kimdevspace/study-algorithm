import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            sb.append(selectedRoom(H, W, N)).append("\n");
        }
        System.out.println(sb);
    }

    private static String selectedRoom(int H, int W, int N) {
        int floor = (N - 1) % H + 1;
        int room = (N - 1) / H + 1;

        return String.format("%d%02d", floor, room);
    }
}