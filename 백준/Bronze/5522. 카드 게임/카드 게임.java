import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ans = 0;
        
        for (int i = 0; i < 5; i++) {
            ans += sc.nextInt();
        }
        
        System.out.println(ans);
    }
}