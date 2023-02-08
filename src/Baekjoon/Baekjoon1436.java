package Baekjoon;

import java.io.*;

public class Baekjoon1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 1; ; i++){
            if(String.valueOf(i).contains("666"))
                count++;

            if(count == N){
                bw.write(i + "\n");
                break;
            }
        }

        bw.flush();
        bw.close();
    }

}