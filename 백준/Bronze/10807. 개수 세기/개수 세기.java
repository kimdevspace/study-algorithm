import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());//배열 크기
        int[] arr = new int[n];//배열 선언

        //배열 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine()); //찾을 정수
        int cnt = 0; // 개수 변수 선언

        //입력한 정수의 개수 찾기
        for(int i = 0; i < n; i++){
            if(arr[i] == v){
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}