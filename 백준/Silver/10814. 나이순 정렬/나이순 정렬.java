import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static class Member {
        int age;
        String name;
        int order;

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age, name, (i + 1));
        }

        Arrays.sort(members, (o1, o2) -> {
            if (o1.age == o2.age) {
                return o1.order - o2.order;
            } else {
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(members[i].age).append(" ").append(members[i].name).append("\n");
        }

        System.out.println(sb);
    }
}
