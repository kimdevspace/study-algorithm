import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer> numbers;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-"); // "-" 를 기준으로 파싱

        numbers = new ArrayList<>();

        while (st.hasMoreTokens()) { // hasMoreToken? -> 사용할 수 있는 토큰이 있는지 확인하는 boolean 메서드
            String str = st.nextToken();
            //System.out.println(str);

            StringTokenizer stPlus = new StringTokenizer(str, "+"); // "+"를 기준으로 파싱
            int sum = 0;
            while (stPlus.hasMoreTokens()) {// +인 것들 더해주기
                //System.out.println(Integer.parseInt(stPlus.nextToken()));
                sum += Integer.parseInt(stPlus.nextToken());
            }
            numbers.add(sum);
        }
        //System.out.println(numbers);

        ans = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            ans -= numbers.get(i);
        }

        System.out.println(ans);
    }
}