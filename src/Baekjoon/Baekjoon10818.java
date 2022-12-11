package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr= new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < N; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
            if(arr[i] <= min){
                min = arr[i];
            }
        }

        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
    }

}