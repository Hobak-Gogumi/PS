package Baekjoon;

import java.io.*;

public class Baekjoon1789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long S = Long.parseLong(br.readLine());

        long sum = 0;
        long i = 0;
        while(true){
            i++;
            sum += i;

            if(S < sum)
                break;
        }

        bw.write(i-1 + "\n");
        bw.flush();
        bw.close();
    }

}