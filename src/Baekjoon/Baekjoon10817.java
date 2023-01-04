package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10817 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];

        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        bw.write(arr[1] + "\n");
        bw.flush();
        bw.close();
    }

}