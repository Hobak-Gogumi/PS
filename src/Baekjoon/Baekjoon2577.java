package Baekjoon;

import java.io.*;

public class Baekjoon2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        int result = num1 * num2 * num3;
        int[] arr = new int[10];

        while(result != 0){
            arr[result % 10]++;
            result = result / 10;
        }

        for(int i = 0; i < 10; i++){
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

}