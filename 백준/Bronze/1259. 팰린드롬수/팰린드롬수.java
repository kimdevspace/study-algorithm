import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();
            if (str.equals("0")) {
                break;
            }

            String str_r;
            char[] arr = new char[str.length()];
            int i = 0;
            int j = str.length() - 1;
            while (true) {
                arr[i] = str.charAt(j);
                i++;
                j--;
                if (i == str.length()) {
                    break;
                }
            }
            String chk = "";
            for (int k = 0; k < arr.length; k++) {
                chk += Character.toString(arr[k]);
            }

            if (chk.equals(str)) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}