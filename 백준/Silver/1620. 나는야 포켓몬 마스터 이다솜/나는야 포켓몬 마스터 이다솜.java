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

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> stringKeyMap = new HashMap<>();
        Map<Integer, String> numberKeyMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String pokemon = br.readLine();

            stringKeyMap.put(pokemon, i);
            numberKeyMap.put(i, pokemon);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            try {
                int key = Integer.parseInt(input);
                System.out.println(numberKeyMap.get(key));
            } catch (NumberFormatException e) {
                System.out.println(stringKeyMap.get(input));
            }
        }
    }
}