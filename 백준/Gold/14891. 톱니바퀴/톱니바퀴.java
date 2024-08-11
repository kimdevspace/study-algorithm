import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] wheels = new int[4][8];
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 4; i++) {
            String str = br.readLine();
            for (int j = 0; j < 8; j++) {
                wheels[i][j] = str.charAt(j) - '0';
            }
        }
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()) - 1;
            int direction = Integer.parseInt(st.nextToken());

            chkLeftWheel(num - 1, -direction);
            chkRightWheel(num + 1, -direction);
            rotate(num, direction);
        }
        for (int i = 0; i < 4; i++) {
            if (wheels[i][0] == 1) {
                ans += Math.pow(2, i);
            }
        }
        bw.write(ans + "");
        br.close();
        bw.flush();
        bw.close();
    }
    public static void chkLeftWheel(int num, int direction) {
        if (num < 0 || wheels[num][2] == wheels[num + 1][6]) {
            return;
        }
        chkLeftWheel(num - 1, -direction);
        rotate(num, direction);
    }
    public static void chkRightWheel(int num, int direction) {
        if (num > 3 || wheels[num][6] == wheels[num - 1][2]) {
            return;
        }
        chkRightWheel(num + 1, -direction);
        rotate(num, direction);
    }
    public static void rotate(int num, int direction) {
        if (direction == 1) {
            int temp = wheels[num][7];
            for (int i = 7; i > 0; i--) {
                wheels[num][i] = wheels[num][i - 1];
            }
            wheels[num][0] = temp;
        }else {
            int temp = wheels[num][0];
            for (int i = 0; i < 7; i++) {
                wheels[num][i] = wheels[num][i + 1];
            }
            wheels[num][7] = temp;
        }
    }
}