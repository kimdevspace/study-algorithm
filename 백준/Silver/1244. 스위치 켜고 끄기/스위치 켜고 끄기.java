import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        //스위치 상태를 담을 배열 선언하고 배열 담기
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 학생 수만큼 성별, 스위치 번호 입력 받기
        int stu = Integer.parseInt(br.readLine());
        for (int i = 0; i < stu; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int sw_num = Integer.parseInt(st.nextToken());

            switch(sex) {
                case 1:
                    for (int j = sw_num - 1; j < N; j += sw_num) {
                        arr[j] = arr[j] == 0 ? 1 : 0;
                    }
                    break;
                case 2:
                    sw_num -= 1;
                    arr[sw_num] = arr[sw_num] == 0 ? 1 : 0;
                    int idx = 1;
                    while (sw_num - idx >= 0 && sw_num + idx < N && arr[sw_num - idx] == arr[sw_num + idx]) {
                        arr[sw_num - idx] = arr[sw_num - idx] == 0 ? 1 : 0;
                        arr[sw_num + idx] = arr[sw_num + idx] == 0 ? 1 : 0;
                        ++idx;
                    }
                    break;
            }
        }
        for (int i = 1; i <= N; i++) {
            bw.write(arr[i - 1] + " ");
            if (i % 20 == 0) {
                bw.write("\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}