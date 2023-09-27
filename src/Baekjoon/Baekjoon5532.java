package Baekjoon;

import java.io.*;

public class Baekjoon5532 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine()); //방학 총 일수
        int A = Integer.parseInt(br.readLine()); //국어문제 총 페이지
        int B = Integer.parseInt(br.readLine()); //수학문제 총 페이지
        int C = Integer.parseInt(br.readLine()); //최대 풀 수 있는 국어문제 페이지
        int D = Integer.parseInt(br.readLine()); //최대 풀 수 있는 수학문제 페이지

        int koreanNeed;
        if((A % C) == 0){
            koreanNeed = A / C;
        }
        else{
            koreanNeed = (A / C) + 1;
        }

        int mathNeed;
        if((B % D) == 0){
            mathNeed = B / D;
        }
        else{
            mathNeed = (B / D) + 1;
        }

        int needDays = Math.max(koreanNeed, mathNeed);

        bw.write(L - needDays + "\n");
        bw.flush();
        bw.close();
    }

}