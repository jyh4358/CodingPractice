package step1.bronze.q2490;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int count;


        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            count = 0;
            for (int j = 0; j < 4; j++) {

                if (st.hasMoreTokens() && st.nextToken().equals("0")) {
                    count++;
                    System.out.println(" count = " + count);
                }
            }
        }
        System.out.println(count);
    }

}
