import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    stack.push(str.charAt(i));
                }else if (str.charAt(i) == ')') {
                    if (!stack.isEmpty() && stack.get(stack.size() - 1) == '(') {
                        stack.pop();
                    }else {
                        stack.push(str.charAt(i));
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}