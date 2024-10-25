import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value > 0) {
                s.push(value);
            } else if (value == 0) {
                s.pop();
            }
        }

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            int sum = 0;
            for (int i = 0; i < s.size(); i++) {
                sum += s.get(i);
            }
            System.out.println(sum);
        }
    }
}