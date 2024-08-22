import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int year;
        int leap;

        year = Integer.parseInt(br.readLine());

        if (year % 4 == 0 && year % 100 != 0)
            leap = 1;
        else if (year % 400 == 0)
            leap = 1;
        else
            leap = 0;

        bw.write(String.valueOf(leap));
        bw.flush();
        bw.close();
    }
}