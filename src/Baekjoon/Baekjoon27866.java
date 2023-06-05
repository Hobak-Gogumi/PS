package Baekjoon;

import java.io.*;

public class Baekjoon27866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        bw.write(S.charAt(i-1) + "\n"); //i번째 문자의 인덱스는 i-1
        bw.flush();
        bw.close();
    }

}