import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strings = str.split("");

        for (int i = 0; i < strings.length; i++) {
            String small = strings[i].toLowerCase();
            if (strings[i].equals(small)) {
                String large = strings[i].toUpperCase();
                System.out.print(large);
            } else {
                System.out.print(small);
            }
        }
    }
}