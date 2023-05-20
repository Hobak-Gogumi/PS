package Baekjoon;

import java.io.*;

public class Baekjoon10808 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] alpha = new int[26];

        for(int i = 0; i < str.length(); i++){
            alpha[str.charAt(i) - 'a']++;
        }

        for(int i = 0; i < alpha.length; i++){
            bw.write(alpha[i] + " ");
        }

        bw.flush();
        bw.close();
    }

}