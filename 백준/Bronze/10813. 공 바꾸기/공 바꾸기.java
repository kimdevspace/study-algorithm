import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int temp;
        
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            temp = arr[I - 1];
            arr[I - 1] = arr[J - 1];
            arr[J - 1] = temp;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}