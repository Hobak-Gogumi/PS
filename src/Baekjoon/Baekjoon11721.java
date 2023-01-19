package Baekjoon;

import java.io.*;

public class Baekjoon11721 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            if(((i % 10) == 0) && (i > 0))
                bw.newLine();

            bw.write(str.charAt(i));

        }

        bw.flush();
        bw.close();
    }

}