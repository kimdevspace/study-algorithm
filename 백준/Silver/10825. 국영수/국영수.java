import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static class Score {
        String name;
        int korean;
        int english;
        int math;

        public Score(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Score[] scores = new Score[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            scores[i] = new Score(name, korean, english, math);
        }

        Arrays.sort(scores, (o1, o2) -> {
            if (o1.korean == o2.korean && o1.english == o2.english && o1.math == o2.math) {
                return o1.name.compareTo(o2.name);
            }
            if (o1.korean == o2.korean && o1.english == o2.english) {
                return o2.math - o1.math;
            }
            if (o1.korean == o2.korean) {
                return o1.english - o2.english;
            }
            return o2.korean - o1.korean;
        });

        for (int i = 0; i < N; i++) {
            sb.append(scores[i].name).append("\n");
        }

        System.out.println(sb);
    }
}