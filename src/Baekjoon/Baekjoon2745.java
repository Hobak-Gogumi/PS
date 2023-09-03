package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2745 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        String N = st.nextToken(); //B진법 수 N
        int B = Integer.parseInt(st.nextToken()); //진법

        //B진법 수 N을 10진법으로 바꾸기
        int len = N.length(); //N의 길이
        int answer = 0;
        for(int i = 0; i < len; i++){
            char c = N.charAt(len-1-i);

            int a = 0;
            if(('0' <= c) && (c <= '9')){
                a = c - '0';
            }
            else if(('A' <= c) && (c <= 'Z')){
                a = c - 55; //A가 10 B가 11 ... Z가 35에 매칭되어야 한다. 'A'는 65값을 가지므로 - 55을 해주면 된다.
            }

            answer += (a * Math.pow(B, i));
        }

        //출력
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}