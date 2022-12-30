package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        n1 = ((n1 % 10) * 100) + ((n1 % 100 / 10) * 10) + (n1 / 100);
        n2 = ((n2 % 10) * 100) + ((n2 % 100 / 10) * 10) + (n2 / 100);

        if(n1 > n2)
            bw.write(n1 + "\n");
        else
            bw.write(n2 + "\n");


        bw.flush();
        bw.close();
    }

}