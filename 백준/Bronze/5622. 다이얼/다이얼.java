import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static Map<Integer, List<Character>> map = new HashMap<>();

    public static void main(String[] args) throws IOException {

        map.put(2, List.of(new Character[]{'A', 'B', 'C'}));
        map.put(3, List.of(new Character[]{'D', 'E', 'F'}));
        map.put(4, List.of(new Character[]{'G', 'H', 'I'}));
        map.put(5, List.of(new Character[]{'J', 'K', 'L'}));
        map.put(6, List.of(new Character[]{'M', 'N', 'O'}));
        map.put(7, List.of(new Character[]{'P', 'Q', 'R', 'S'}));
        map.put(8, List.of(new Character[]{'T', 'U', 'V'}));
        map.put(9, List.of(new Character[]{'W', 'X', 'Y', 'Z'}));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // 숫자 1을 걸려면 2초, 즉 기본값은 2초임.
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 2; j <= 9; j++) {
                if (map.get(j).contains(c)) {
                    sum += (j + 1);
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}