import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());

            map.merge(num, 1, Integer::sum);
        }

        // 최대 빈도 찾기
        int maxCount = Collections.max(map.values());

        // TreeMap이므로 Key 순서로 탐색 → 가장 작은 값이 먼저 나옴
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey());
                break; // 첫 번째로 찾은 것이 가장 작은 값
            }
        }
    }
}