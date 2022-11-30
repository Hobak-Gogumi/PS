package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] sarr = s.toCharArray();
        int[] alpha = new int[26];

        for(int i = 0; i < 26; i++){
            alpha[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            if(alpha[sarr[i]-97] == -1){
                alpha[sarr[i]-97] = i;
            }
        }

        for(int i = 0; i < 26; i++){
            System.out.print(alpha[i] + " ");
        }

    }
}