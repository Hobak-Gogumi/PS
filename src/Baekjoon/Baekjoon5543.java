package Baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon5543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] burger = new int[3];
        int[] drink = new int[2];

        for(int i = 0; i < 3; i++){
            burger[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 2; i++){
            drink[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(burger);
        Arrays.sort(drink);

        bw.write(String.valueOf(burger[0] + drink[0] - 50) + "\n");
        bw.flush();
        bw.close();
    }

}