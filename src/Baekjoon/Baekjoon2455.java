package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2455 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int max = Integer.MIN_VALUE;
        int people = 0;
        for(int i = 0; i < 4; i++){
            st = new StringTokenizer(br.readLine());

            int off = Integer.parseInt(st.nextToken()); //내린 사람의 수
            int on = Integer.parseInt(st.nextToken()); //탄 사람의 수

            people = people - off + on;
            if(people > 10000) //기차의 정원은 최대 10,000명. 정원을 초과하여 타는 경우는 없다.
                people = 1000;

            max = Math.max(max, people);
        }

        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }

}