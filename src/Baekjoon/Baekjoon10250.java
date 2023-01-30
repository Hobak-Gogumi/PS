package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); //호텔의 층 수
            int W = Integer.parseInt(st.nextToken()); //각 층의 방 수
            int N = Integer.parseInt(st.nextToken()); //몇 번째 손님

            int Y;
            if((N % H) == 0)
                Y = H;
            else
                Y = N % H;
            int X = ((N-1) / H) + 1;

            int ans = (Y * 100) + X;
            bw.write(ans + "\n");
        }

        bw.flush();
        bw.close();
    }

}