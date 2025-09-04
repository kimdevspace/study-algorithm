import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        temp = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);

    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);

        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        copy(arr, left, right);

        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {
            if (temp[l] <= temp[r]) {
                arr[idx++] = temp[l++];
            } else {
                arr[idx++] = temp[r++];
            }
        }

        while (l <= mid) {
            arr[idx++] = temp[l++];
        }

        while (r <= right) {
            arr[idx++] = temp[r++];
        }
    }

    static void copy(int[] arr, int left, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
    }
}