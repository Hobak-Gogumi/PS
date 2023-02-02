package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] x = new int[4];
        int[] y = new int[4];

        //입력
        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        //x좌표 구하기
        if(x[0] == x[1])
            x[3] = x[2];
        else if(x[0] == x[2])
            x[3] = x[1];
        else if(x[1] == x[2])
            x[3] = x[0];

        //y좌표 구하기
        if(y[0] == y[1])
            y[3] = y[2];
        else if(y[0] == y[2])
            y[3] = y[1];
        else if(y[1] == y[2])
            y[3] = y[0];

        bw.write(x[3] + " " + y[3] + "\n");
        bw.flush();
        bw.close();
    }

}
