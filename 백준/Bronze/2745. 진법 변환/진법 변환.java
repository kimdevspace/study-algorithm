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

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 65; i < 91; i++) {
            map.put((char) i, i - 55);
        }



        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int ans = 0;
        int exponent = 0;
        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            if (Character.isAlphabetic(c)) {
                ans += map.get(N.charAt(i)) * (int) Math.pow(B, exponent++);
            } else {
                ans += (c - '0') * (int) Math.pow(B, exponent++);
            }
        }

        System.out.println(ans);

    }
}