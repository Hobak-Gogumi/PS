package Baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon2309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];

        int sum = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int spy1 = 0;
        int spy2 = 0;
        loop:
        for(int i = 0; i < 8; i++){
            for(int j = i+1; j < 9; j++){
                if((sum - arr[i] - arr[j]) == 100){
                    spy1 = i;
                    spy2 = j;
                    break loop;
                }
            }
        }

        for(int i = 0; i < 9; i++){
            if((i == spy1) || (i == spy2))
                continue;
            else
                bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();

    }

}