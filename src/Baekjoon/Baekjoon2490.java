package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2490 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for(int i = 0; i < 3; i++){ // 줄을 총 3개 입력받음
            st = new StringTokenizer(br.readLine());

            int count = 0; //배(0)의 개수를 카운트 할 변수
            for(int j = 0; j < 4; j++){
                if(Integer.parseInt(st.nextToken()) == 0)
                    count++;
            }

            switch(count){
                case 0:
                    bw.write("E\n");
                    break;
                case 1:
                    bw.write("A\n");
                    break;
                case 2:
                    bw.write("B\n");
                    break;
                case 3:
                    bw.write("C\n");
                    break;
                case 4:
                    bw.write("D\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }

}