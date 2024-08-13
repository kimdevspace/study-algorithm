import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int T;
    static int[] cards;
    static int exchangeCnt;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            String card = st.nextToken();
            exchangeCnt = Integer.parseInt(st.nextToken());
            cards = new int[card.length()];
            for (int i = 0; i < card.length(); i++) {
                cards[i] = card.charAt(i) - '0';
            }
            exchangeCnt = Math.min(exchangeCnt, cards.length);
            ans = 0;
            exchange(0, 0);
            System.out.println("#" + tc + " " + ans);
        }


    }
    private static void exchange(int idx, int cnt) {
        if (cnt == exchangeCnt) {
            String str = "";
            for (int i = 0; i < cards.length; i++) {
                str += cards[i];
            }
            ans = Math.max(ans, Integer.parseInt(str));
            return;
        }
        for (int i = idx; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                swap(i, j);
                exchange(i,cnt + 1);
                swap(i, j);
            }
        }
    }
    private static void swap(int i, int j) {
        int temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }
}