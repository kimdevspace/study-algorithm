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
            boolean[] checker = new boolean[26];
            int prev = 0;

            boolean check = false;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (prev != c) {
                    if (checker[c - 'a']) {
                        check = false;
                        break;
                    }
                    else if (!checker[c - 'a']) {
                        checker[c - 'a'] = true;
                        check = true;
                        prev = c;
                    }
                }
            }
            if (check) cnt++;
        }

        System.out.println(cnt);
    }
}