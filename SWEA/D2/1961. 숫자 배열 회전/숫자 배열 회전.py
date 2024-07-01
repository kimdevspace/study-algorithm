import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    //90도 회전 함수
    public static int[][] rotate(int arr[][]) {
        int len = arr.length;
        int res[][] = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                res[i][j] = arr[len - 1 - j][i];
            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];

            StringTokenizer st;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int arr90[][] = new int[N][N];
            int arr180[][] = new int[N][N];
            int arr270[][] = new int[N][N];

            arr90 = rotate(arr);
            arr180 = rotate(arr90);
            arr270 = rotate(arr180);

            bw.write("#" + tc + "\n");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    bw.write(arr90[i][j]+"");
                }
                bw.write(" ");
                for (int j = 0; j < N; j++) {
                    bw.write(arr180[i][j]+"");
                }
                bw.write(" ");
                for (int j = 0; j < N; j++) {
                    bw.write(arr270[i][j]+"");
                }
                bw.write("\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}