import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * mergeSort
 * 1. 기저조건. 더 이상 안나눠 질 때까지 나누기
 * 2. 왼쪽으로
 * 3. 오른쪽으로
 * 4. 병합
 *  - 임시 배열 만들기
 *  - l, r, idx 포인터 사용
 *  - while문으로 비교하며 넣기
 *  - 남은거 처리
 */

public class Main {
    static int[] temp; // 전역 임시 배열
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        temp = new int[N]; // 임시 배열 초기화
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        mergeSort(arr, 0, arr.length - 1);
        
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
    
    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    
    private static void merge(int[] arr, int left, int mid, int right) {
        copyRange(arr, left, right); // 필요한 범위만 복사
        
        int l = left;
        int r = mid + 1;
        int idx = left;
        
        while (l <= mid && r <= right) {
            if (temp[l] <= temp[r]) {
                arr[idx] = temp[l];
                l++;
            } else {
                arr[idx] = temp[r];
                r++;
            }
            idx++;
        }
        
        // 왼쪽 남은것들
        while (l <= mid) {
            arr[idx] = temp[l];
            l++;
            idx++;
        }
        
        // 오른쪽 남은것들
        while (r <= right) {
            arr[idx] = temp[r];
            r++;
            idx++;
        }
    }
    
    // 필요한 범위를 전역 temp 배열에 복사
    private static void copyRange(int[] arr, int left, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
    }
}