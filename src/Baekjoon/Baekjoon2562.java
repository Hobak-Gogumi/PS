package Baekjoon;

import java.io.*;

public class Baekjoon2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];

        for(int i = 0; i < 9 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int index = 1;
        for(int i = 1; i < 9; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i+1;
            }
        }

        bw.write(max + "\n" + index + "\n");
        bw.flush();
        bw.close();
    }
}