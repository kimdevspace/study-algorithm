import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }

        int max = 0;
        char res = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                res = (char) (i + 'A');
            } else if (count[i] == max && max > 0) { // 최댓값과 동일한 값 있으면 
                res = '?';
            }
        }

        System.out.println(res);
    }
}