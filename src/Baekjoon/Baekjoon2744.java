package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2744 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 소문자일 경우, 대문자로
        // 대문자일 경우, 소문자로
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                System.out.print((char)(s.charAt(i) - 32));
            else
                System.out.print((char)(s.charAt(i) + 32));
        }
    }
}