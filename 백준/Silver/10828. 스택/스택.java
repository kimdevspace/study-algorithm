import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static class Stack {

        static final int MAX_SIZE = 10_001;

        int[] arr = new int[MAX_SIZE];
        int top;

        public Stack() {
            top = -1;
        }

        public void push(int x) {
            if (top >= MAX_SIZE - 1) {
                throw new RuntimeException("Stack Overflow");
            } else {
                top += 1;
                arr[top] = x;
            }
        }

        public int pop() {
            if (top < 0) {
                return -1;
            } else {
                int x = arr[top];
                top -= 1;
                return x;
            }
        }

        public int top() {
            if (top < 0) {
                return -1;
            } else {
                return arr[top];
            }
        }

        public int empty() {
            return top < 0 ? 1 : 0;
        }

        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        Stack stack = new Stack();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case "pop":
                    sb.append(stack.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.empty()).append("\n");
                    break;
                case "top":
                    sb.append(stack.top()).append("\n");
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}
