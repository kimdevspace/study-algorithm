import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();

         int N = Integer.parseInt(br.readLine());
         int max = 0;
         int[] arr = new int[N];

         for (int i = 0; i < N; i++) {
             arr[i] = Integer.parseInt(br.readLine());
             max = Math.max(arr[i], max);
         }

         int[] result = countingSort(arr, max);

         for (int i = 0; i < N; i++) {
             sb.append(result[i]).append("\n");
         }

         System.out.println(sb);
     }

     static int[] countingSort(int[] arr, int k) {
         int n = arr.length;
         int[] count = new int[k + 1];
         int[] result = new int[n];

         for (int i = 0; i < n; i++) {
             count[arr[i]]++;
         }

         for (int i = 1; i <= k; i++) {
             count[i] += count[i - 1];
         }

         for (int i = n - 1; i >= 0; i--) {
             result[count[arr[i]] - 1] = arr[i];
             count[arr[i]]--;
         }

         return result;
     }
}