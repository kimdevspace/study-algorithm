import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (check(str)) cnt++;
        }

        System.out.println(cnt);
    }

    private static boolean check(String str) {
        boolean[] checker = new boolean[26];
        int prev = 0;

        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);

            if (prev != c) {
                if (checker[c - 'a']) {
                    return false;
                }
                else if (!checker[c - 'a']) {
                    checker[c - 'a'] = true;
                    prev = c;
                }
            }
        }

        return true;
    }
}