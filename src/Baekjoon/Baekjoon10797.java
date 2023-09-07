package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10797 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int day = Integer.parseInt(br.readLine()); //날짜의 일의 자리 숫자

        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++){ //5대의 자동차 번호 일의 자리 숫자가 주어짐
            if(Integer.parseInt(st.nextToken()) == day) //날짜와 번호가 같으면 카운트 증가
                count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}
