package Baekjoon;

import java.io.*;

public class Baekjoon25640 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String jinho = br.readLine();
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 0; i < N; i++){
            if(br.readLine().equals(jinho))
                count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}