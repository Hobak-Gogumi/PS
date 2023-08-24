package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1074 {

    static int order = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken()); //r행
        int c = Integer.parseInt(st.nextToken()); //c열
        //*행과 열은 0부터 시작한다.
        //입력 종료

        int length = (int) Math.pow(2, N); //한 변의 길이

        sol(length, r, c);

        //출력
        bw.write(order + "\n");
        bw.flush();
        bw.close();
    }

    static void sol(int length, int r, int c){

        if(length == 1)
            return;

        if((r < length/2) && (c <length/2)){ //첫번째 구역에 존재
            sol(length / 2, r, c);
        }
        else if((r < length/2) && (c < length)){ //두번째 구역에 존재
            order += (length * length / 4);
            sol(length / 2, r, c - length/2);
        }
        else if((r < length) && (c < length/2)){ //세번째 구역에 존재
            order += (length * length / 4) * 2;
            sol(length / 2, r - length/2, c);
        }
        else{ //네번째 구역에 존재
            order += (length * length / 4) * 3;
            sol(length / 2, r - length/2, c - length/2);
        }
    }

}