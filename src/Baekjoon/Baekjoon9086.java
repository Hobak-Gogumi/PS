package Baekjoon;

import java.io.*;

public class Baekjoon9086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String str = br.readLine();
            int length = str.length();
            bw.write(String.valueOf(str.charAt(0)));
            bw.write(String.valueOf(str.charAt(length-1)));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

}
