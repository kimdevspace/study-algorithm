import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int idx = 0;

        System.out.print("<");
        while (list.size() > 1) {
            idx = (idx + (K - 1)) % list.size();
            System.out.print(list.get(idx) + ", ");
            list.remove(idx);
        }
        System.out.print(list.remove(0) + ">");


    }
}