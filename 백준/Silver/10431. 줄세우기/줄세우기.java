import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr;

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            arr = new int[20];

            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tcNumber = Integer.parseInt(st.nextToken());
            for (int i = 0; i < 20; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[i]) cnt++;
                }
            }

            System.out.println((tc + 1) + " " + cnt);

        }
    }
}