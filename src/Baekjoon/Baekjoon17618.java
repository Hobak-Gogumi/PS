package Baekjoon;

import java.io.*;

public class Baekjoon17618 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 1; i <= N; i++){
            int m = i;
            int s = 0;
            while(m != 0){
                s += (m % 10);
                m = m / 10;
            }

            if((i % s) == 0)
                count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}
