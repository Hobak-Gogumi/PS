package Baekjoon;

import java.io.*;

public class Baekjoon23795 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        while(true){
            int n = Integer.parseInt(br.readLine());

            if(n == -1)
                break;

            sum += n;
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }

}