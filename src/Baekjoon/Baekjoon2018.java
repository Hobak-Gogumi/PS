package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int start_index = 1;
        int end_index = 1;
        int count = 0;
        int sum = 1;

        for(;start_index <= N;){
            if(sum < N){
                end_index++;
                sum = sum + end_index;
            } else if(sum == N){
                count++;
                sum = sum - start_index;
                start_index++;
            } else if(sum > N){
                sum = sum - start_index;
                start_index++;
            }
        }

        System.out.println(count);

    }

}
