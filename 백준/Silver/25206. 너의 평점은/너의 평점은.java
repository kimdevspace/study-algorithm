import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> board = new HashMap<>();
        board.put("A+", 4.5);
        board.put("A0", 4.0);
        board.put("B+", 3.5);
        board.put("B0", 3.0);
        board.put("C+", 2.5);
        board.put("C0", 2.0);
        board.put("D+", 1.5);
        board.put("D0", 1.0);
        board.put("F", 0.0);

        double totalCredit = 0;
        double sum = 0;

        for (int i = 0; i < 20; i++) {
            String[] strings = br.readLine().split(" ");
            double credit = Double.parseDouble(strings[1]);
            if (strings[2].equals("P")) {
                continue;
            }
            totalCredit += credit;
            sum += credit * board.get(strings[2]);
        }

        double ans = sum / totalCredit;

        System.out.println(ans);

    }
}