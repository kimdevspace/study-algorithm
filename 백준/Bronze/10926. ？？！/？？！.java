import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = "??!";
        String s = br.readLine();
        bw.write(s+a);
        bw.flush();
        bw.close();
    }
}