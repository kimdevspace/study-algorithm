import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr = {1, 1, 2, 2, 2, 8};

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] - Integer.parseInt(st.nextToken()) + " ");
        }
    }
}