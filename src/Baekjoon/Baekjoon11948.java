package Baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon11948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] science = new int[4];
        int[] society = new int[2];

        for(int i = 0; i < 4; i++){
            science[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < 2; i++){
            society[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(science);
        Arrays.sort(society);

        int sum = 0;
        for(int i = 1; i < 4; i++){
            sum += science[i];
        }

        for(int i = 1; i < 2; i++){
            sum += society[i];
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();

    }

}