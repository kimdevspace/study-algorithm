import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] arr;
    static int[] lisLength, ldsLength;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 각 위치에서 왼쪽은 lis, 오른쪽은 lds를 구한다.
        List<Integer> lis = new ArrayList<>();
        lisLength = new int[N];
        for (int i = 0; i < N; i++) {
            int pos = bs(lis, arr[i]);

            if (pos == lis.size()) {
                lis.add(arr[i]);
            } else {
                lis.set(pos, arr[i]);
            }

            lisLength[i] = pos + 1;
        }

        // lds는 배열을 거꾸로 뒤집은 후 lis로 계산! 그 후에 길이가 저장된 배열도 뒤집어 주면 된다.
        List<Integer> lds = new ArrayList<>();
        int[] reversedArr = new int[N];
        for (int i = 0; i < N; i++) {
            reversedArr[i] = arr[N - 1 - i];
        }
        ldsLength = new int[N];
        for (int i = 0; i < N; i++) {
            int pos = bs(lds, reversedArr[i]);

            if (pos == lds.size()) {
                lds.add(reversedArr[i]);
            } else {
                lds.set(pos, reversedArr[i]);
            }

            ldsLength[i] = pos + 1;
        }

        // 길이 배열 뒤집기
        for (int i = 0; i < N / 2; i++) {
            int temp = ldsLength[i];
            ldsLength[i] = ldsLength[N - 1 - i];
            ldsLength[N - 1 - i] = temp;
        }

        // 계산
        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            maxLength = Math.max(maxLength, lisLength[i] + ldsLength[i] - 1);
        }

        System.out.println(maxLength);
    }

    private static int bs(List<Integer> list, int target) {
        int left = 0;
        int right = list.size();

        while (left < right) {
            int mid = (left + right) / 2;

            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}