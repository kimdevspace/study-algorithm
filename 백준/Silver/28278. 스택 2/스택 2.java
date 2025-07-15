import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class Stack {
        List<Integer> list;

        Stack(int size) {
            list = new ArrayList<>(size);
        }

        public void add(int X) {
            list.add(X);
        }

        public int pop() {
            int maxSize = list.size() - 1;

            if (!list.isEmpty()) {
                return list.remove(maxSize);
            } else {
                return -1;
            }
        }

        public int length() {
            return list.size();
        }

        public int isEmpty() {
            if (list.isEmpty()) return 1;
            else return 0;
        }

        public int top() {
            int maxSize = list.size() - 1;

            if (!list.isEmpty()) return list.get(maxSize);
            else return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        Stack stack = new Stack(N);

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                int X = Integer.parseInt(st.nextToken());
                stack.add(X);
            } else if (command == 2) {
                System.out.println(stack.pop());
            } else if (command == 3) {
                System.out.println(stack.length());
            } else if (command == 4) {
                System.out.println(stack.isEmpty());
            } else {
                System.out.println(stack.top());
            }
        }
    }
}