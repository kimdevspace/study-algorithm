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

        Map<Integer, String> pokemonDict1 = new HashMap<>();
        Map<String, Integer> pokemonDict2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String pokemon = br.readLine();
            pokemonDict1.put(i, pokemon);
            pokemonDict2.put(pokemon, i);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            char numCheck = input.charAt(0);
            if (49 <= numCheck && numCheck <= 57) {
                System.out.println(pokemonDict1.get(Integer.parseInt(input)));
            } else {
                System.out.println(pokemonDict2.get(input));
            }
        }
    }
}