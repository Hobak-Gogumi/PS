package Baekjoon;

import java.io.*;

public class Baekjoon1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine()); //X번째 분수 구하기

        for(int floor = 1; ; floor++){
            int max = (floor * (floor + 1)) / 2;

            if(X <= max){
                if((floor % 2) == 1){ //홀수 층 일때
                    bw.write((max-X+1) + "/" + (X+floor-max) + "\n");
                } else{ // 짝수 층 일때
                    bw.write((X+floor-max) + "/" + (max-X+1) + "\n");
                }
                break;
            }
        }

        bw.flush();
        bw.close();
    }

}