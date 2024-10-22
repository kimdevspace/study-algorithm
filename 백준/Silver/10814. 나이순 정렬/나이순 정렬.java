import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class UserInfo {
        int number;
        int age;
        String name;

        public UserInfo(int number, int age, String name) {
            this.number = number;
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<UserInfo> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new UserInfo(i, age, name));
        }

        Collections.sort(list, new Comparator<UserInfo>() {
            @Override
            public int compare(UserInfo o1, UserInfo o2) {
                if (o1.age != o2.age) {
                    return Integer.compare(o1.age, o2.age);
                } else {
                    return Integer.compare(o1.number, o2.number);
                }
            }
        });

        for (UserInfo userInfo : list) {
            System.out.println(userInfo);
        }
    }
}