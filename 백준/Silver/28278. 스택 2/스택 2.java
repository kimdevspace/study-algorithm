import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class Stack {
        int[] arr;
        int top;

        Stack(int size) {
            arr = new int[size];
            top = -1;
        }

        public void add(int X) {
            arr[++top] = X;
        }

        public int pop() {
            if (top == -1) return -1;
            else return arr[top--];
        }

        public int length() {
            return top + 1;
        }

        public int isEmpty() {
            if (top == -1) return 1;
            else return 0;
        }

        public int top() {
            if (isEmpty() == 1) return - 1;
            else return arr[top];
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