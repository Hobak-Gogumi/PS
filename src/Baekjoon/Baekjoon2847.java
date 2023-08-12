package Baekjoon;

import java.io.*;

public class Baekjoon2847 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //레벨의 수 입력받기
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i = N-2; i >= 0; i--){
            while(arr[i+1] <= arr[i]){
                arr[i]--;
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}