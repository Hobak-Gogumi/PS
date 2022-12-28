package Baekjoon;

import java.io.*;

public class Baekjoon1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        str = str.toUpperCase(); // 대문자로 변경

        int[] alpha = new int[26]; // 알파벳의 개수를 저장할 배열 생성

        // 알파벳 개수 count
        for(int i = 0; i < str.length(); i++){
            alpha[str.charAt(i)-'A']++;
        }

        int max = -1;
        char ans = '?';
        for(int i = 0; i < 26; i++){
            if(alpha[i] > max){
                max = alpha[i];
                ans = (char)(i + 65);
            } else if(alpha[i] == max){
                ans = '?';
            }
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

}