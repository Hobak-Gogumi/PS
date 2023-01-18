package Baekjoon;

import java.io.*;

public class Baekjoon1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String N = br.readLine();
        int[] arr = new int[N.length()];

        for(int i = 0; i < N.length(); i++){
            arr[i] = N.charAt(i) - '0';
        }

        //정렬
        for(int index = 0; index < N.length()-1; index++){

            int max_index = index;
            for(int i = index; i < N.length(); i++){
                if(arr[i] > arr[max_index])
                    max_index = i;
            }

            int temp = arr[max_index];
            arr[max_index] = arr[index];
            arr[index] = temp;
        }

        //출력
        for(int i = 0; i < arr.length; i++){
            bw.write(String.valueOf(arr[i]));
        }

        bw.newLine();
        bw.flush();
        bw.close();
    }

}