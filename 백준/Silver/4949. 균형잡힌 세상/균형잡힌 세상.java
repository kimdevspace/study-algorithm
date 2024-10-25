import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String input = sc.nextLine();
            
            // 종료 조건
            if (input.equals(".")) {
                break;
            }
            
            // 균형 검사 결과 출력
            if (isBalanced(input)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
    
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            // 여는 괄호는 스택에 push
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } 
            // 닫는 소괄호 검사
            else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } 
            // 닫는 대괄호 검사
            else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }
        
        // 모든 괄호를 처리한 후 스택이 비어있다면 균형이 맞음
        return stack.isEmpty();
    }
}
