import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int tc = 0; tc < T; tc++) {

            Map<String, Integer> map = new HashMap<>();
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                /**
                 * 종류별 의상의 개수를 구한다. 의상1, 의상2, ... , 입지 않는 경우.
                 */
                st.nextToken();

                String kind = st.nextToken();

                if (!map.containsKey(kind)) {
                    map.put(kind, 1);
                } else {
                    map.put(kind, map.get(kind) + 1);
                }
            }

            int result = 1;

            for (int val : map.values()) {
                result *= val + 1;
            }

            System.out.println(result - 1);
        }
    }
}