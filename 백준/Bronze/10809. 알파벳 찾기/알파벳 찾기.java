import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 아스키 변환 idx=0 은 아스키97 -> 알파벳
        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 ,-1, -1, -1, -1,
        -1, -1, -1, -1, -1, -1, -1, -1, -1};

        String[] str = sc.next().split("");

        for (int i = 0; i < str.length; i++) {
            if (arr[str[i].charAt(0) - 97] == -1) arr[str[i].charAt(0) - 97] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}