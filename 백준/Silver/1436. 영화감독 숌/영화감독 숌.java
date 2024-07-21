import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        String str = "666";
        int start = 0;
        int cnt = 0;
        while (true) {
            if ((start + "").contains(str)) {
                cnt += 1;
            }
            if (N == cnt) {
                System.out.println(start);
                break;
            }
            start++;
        }

    }
}