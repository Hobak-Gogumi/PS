package Baekjoon;

import java.io.*;

public class Baekjoon9655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //N 입력받기
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[1000];
        int i;
        for(i = 0; ; i++){

            if(N >= 3)
                arr[i] = 3;
            else //남은 돌의 개수가 1, 2일 경우
                arr[i] = 1;

            N = N - arr[i];

            if(N == 0)
                break;
        }

        if((i % 2) == 0)
            bw.write("SK");
        else
            bw.write("CY");

        bw.flush();
        bw.close();
    }

}
// 이 방법 말고도 홀수면 무조건 상근이 승리, 짝수면 무조건 창영이 승리하는 것을 이용한 풀이도 있음.
// 풀이는 블로그에 적었다.