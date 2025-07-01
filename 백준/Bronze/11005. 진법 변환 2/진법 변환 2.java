import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Map<Integer, Character> map = new HashMap<>();

        for (int i = 65; i < 91; i++) {
            map.put(i - 55, (char) i);
        }

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            if (map.containsKey(N % B)) {
                sb.append(map.get(N % B));
            } else {
                sb.append(N % B);
            }
            N /= B;
        }


        System.out.println(sb.reverse());
    }
}