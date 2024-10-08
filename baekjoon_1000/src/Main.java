import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number1, number2, total;

        number1 = Integer.parseInt(st.nextToken());
        number2 = Integer.parseInt(st.nextToken());
        total = number1 + number2;

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }
}