import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] sList = new String[N];
        for (int i = 0; i < N; i++) {
            sList[i] = br.readLine();
        }
        br.close();

        Arrays.sort(sList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(sList[0]);
        for (int i = 1; i < N; i++) {
            if (sList[i].equals(sList[i - 1])) {
                continue;
            }
            System.out.println(sList[i]);
        }
    }
}